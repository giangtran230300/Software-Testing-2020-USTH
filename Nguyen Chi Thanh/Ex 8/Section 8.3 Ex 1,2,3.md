Thermostat.java

import java.io.*;

import java.util.*;

// Programmable Thermostat

public class Thermostat

{

   private int curTemp;          // current temperature reading
   
   private int thresholdDiff;    // temp difference until we turn heater on
   
   private int timeSinceLastRun; // time since heater stopped
   
   private int minLag;           // how long I need to wait
   
   private boolean override;     // has user overridden the program
   
   private int overTemp;         // overriding temperature
   
   private int runTime;          // output of turnHeaterOn - how long to run
   
   private boolean heaterOn;     // output of turnHeaterOn - whether to run
   
   private Period period;        // morning, day, evening, or night
   
   private DayType day;          // week day or weekend day

   // Decide whether to turn the heater on, and for how long.
   
   public boolean turnHeaterOn (ProgrammedSettings pSet)
   
   {

      int dTemp = pSet.getSetting (period, day);

      if (((curTemp < dTemp - thresholdDiff) ||
           (override && curTemp < overTemp - thresholdDiff)) &&
           (timeSinceLastRun > minLag))
      {  // Turn on the heater
         // How long? Assume 1 minute per degree (Fahrenheit)
         int timeNeeded = curTemp - dTemp;
         if (override)
            timeNeeded = curTemp - overTemp;
         setRunTime (timeNeeded);
         setHeaterOn (true);
         return (true);
      }
      else
      {
         setHeaterOn (false);
         return (false);
      }
   } // End turnHeaterOn

   public void setCurrentTemp (int temperature)  { curTemp = temperature; }
   
   public void setThresholdDiff (int delta)      { thresholdDiff = delta; }
   
   public void setTimeSinceLastRun (int minutes) { timeSinceLastRun = minutes; }
   
   public void setMinLag (int minutes)           { minLag = minutes; }
   
   public void setOverride (boolean value)       { override = value; }
   
   public void setOverTemp (int temperature)     { overTemp = temperature; }
   

   // for the ProgrammedSettings
   
   public void setDay (DayType curDay)           { day = curDay; }
   
   public void setPeriod (Period curPeriod)      { period = curPeriod; }
   

   // outputs from turnHeaterOn - need corresponding getters to activate heater
   
   void setRunTime  (int minutes)         { runTime = minutes; }
   
   void setHeaterOn (boolean value)       { heaterOn = value; }
   
} // End Thermostat class

Programmed Settings.java:

import java.util.*;


public class ProgrammedSettings

{

   private Map<Period, Map<DayType, Integer>> settings =
   
       new HashMap<Period, Map<DayType, Integer>>();
       

   // Property
   
   public ProgrammedSettings ()
   
   {
   
      for (Period p : Period.values())
      
      {
         HashMap<DayType, Integer> m = new HashMap<DayType, Integer>();
         settings.put (p, m);
         for (DayType d : DayType.values())
         {
            m.put (d, 65); // Default value, 18.33C
         }
      }
   }
   
   public void setSetting (Period period, DayType day, int temp)
   
   {
   
      settings.get (period).put (day, temp);
   }
   
   public int getSetting (Period period, DayType day)
   
   {
   
      return settings.get (period).get (day);
   }
   
   public String toString()
   
   {
   
      return settings.toString();
   }
} // End ProgrammedSettings class

DayType.java:

public enum DayType

{

   WEEKDAY, WEEKEND
}

Period.java:


public enum Period

{

   MORNING, DAY, EVENING, NIGHT
   
}
