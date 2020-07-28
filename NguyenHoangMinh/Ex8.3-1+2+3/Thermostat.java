// Based on Software Testing Web Code
import java.io.*;
import java.time.Period;
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
    private int runTime;          // output of isEnergyEfficient - how long to run
    private Period period;        // morning, day, evening, or night
    private int day;          // week day or weekend day
    private boolean isHeating;  //Whether the unit is currently heating or not


    public boolean isEnergyEfficient (ProgrammedSettings pSet)
    {
        int dTemp = pSet.getSetting (period, day);

        if((isHeating && dTemp < 80 && !override) ||
                (!isHeating && ( (dTemp > 60 || override) ^ (thresholdDiff < 5) ))
        )
        {

            int timeNeeded = curTemp - dTemp;
            if (override) {
                timeNeeded = curTemp - overTemp;
            }
            setRunTime (timeNeeded);

            if(timeNeeded > 10)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        System.out.println("test2");
        return false;
    }

    public void setCurrentTemp (int temperature)  { curTemp = temperature; }
    public void setThresholdDiff (int delta)      { thresholdDiff = delta; }
    public void setTimeSinceLastRun (int minutes) { timeSinceLastRun = minutes; }
    public void setMinLag (int minutes)           { minLag = minutes; }
    public void setOverride (boolean value)       { override = value; }
    public void setOverTemp (int temperature)     { overTemp = temperature; }
    public void setIsHeating (boolean value)       { isHeating = value; }

    // for the ProgrammedSettings
    public void setDay (int curDay)           { day = curDay; }
    public void setPeriod (Period curPeriod)      { period = curPeriod; }

    // outputs from turnHeaterOn - need corresponding getters to activate heater
    void setRunTime  (int minutes)         { runTime = minutes; }



}