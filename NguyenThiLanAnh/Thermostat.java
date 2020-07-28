import java.io.*;
import java.util.*;

public class Thermostat {
    private int curTemp;
    private int thresholdDiff;
    private int timeSinceLastRun;
    private int minLag;
    private boolean override;
    private int overTemp;
    private int runTime;
    private boolean heaterOn;
    private Period period;
    private DayType day;

    public boolean turnHeaterOn(ProgrammedSettings pSet) {
        int dTemp = pSet.getSetting(period, day);
        if (((curTemp < dTemp - thresholdDiff) || (override && curTemp < overTemp - thresholdDiff))
                && (timeSinceLastRun > minLag)) {
            int timeNeeded = Math.abs(dTemp - curTemp);
            if (override)
                timeNeeded = Math.abs(overTemp - curTemp);
            setRunTime(timeNeeded);
            setHeaterOn(true);
            return (true);
        } 
        else {
            setHeaterOn(false);
            return (false);
        }
    }

    public void setCurrentTemp(int temperature) {
        curTemp = temperature;
    }

    public void setThresholdDiff(int delta) {
        thresholdDiff = delta;
    }

    public void setTimeSinceLastRun(int minutes) {
        timeSinceLastRun = minutes;
    }

    public void setMinLag(int minutes) {
        minLag = minutes;
    }

    public void setOverride(boolean value) {
        override = value;
    }

    public void setOverTemp(int temperature) {
        overTemp = temperature;
    }

    public void setDay(DayType curDay) {
        day = curDay;
    }

    public void setPeriod(Period curPeriod) {
        period = curPeriod;
    }

    void setRunTime(int minutes) {
        runTime = minutes;
    }

    int getRunTime() {
        return runTime;
    }

    void setHeaterOn(boolean value) {
        heaterOn = value;
    }

    boolean getHeaterOn() {
        return heaterOn;
    }
}