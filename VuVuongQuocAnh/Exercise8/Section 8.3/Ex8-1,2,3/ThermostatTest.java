package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.awt.print.PrinterAbortException;
import java.util.*;

public class ThermostatTest {
    Thermostat thermo;
    ProgrammedSettings settings;

    @Before
    public void setUp() {
        thermo = new Thermostat();
        settings = new ProgrammedSettings();
        settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
        thermo.setPeriod(Period.MORNING);
        thermo.setDay(DayType.WEEKDAY);
    }
    @Test
    public void testPredicateTrue() {
        thermo.setCurrentTemp(63);
        thermo.setThresholdDiff(5);
        thermo.setOverride(true);
        thermo.setOverTemp(70);
        thermo.setMinLag(10);
        thermo.setTimeSinceLastRun(12);
        assertTrue(thermo.turnHeaterOn(settings));
    }

    @Test
    public void testPredicateFalse() {
        thermo.setPeriod(Period.MORNING);
        thermo.setDay(DayType.WEEKDAY);
        thermo.setCurrentTemp(63);
        thermo.setThresholdDiff(8);
        thermo.setOverride(false);
        thermo.setOverTemp(70);
        thermo.setMinLag(13);
        thermo.setTimeSinceLastRun(12);
        assertFalse(thermo.turnHeaterOn(settings));
    }
    // This two tests satisfy both PC and CC, a b c d are all true at the first test
    // and all false at the second test

    @Test
    // Major clause a is true
    public void TestCACC1() {
        thermo.setCurrentTemp (63);
        thermo.setThresholdDiff (5);
        thermo.setOverride (true);
        thermo.setOverTemp (67); // c is false
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (12);
    }

    @Test
    // Major clause a is false, major clause c is false
    public void TestCACC2() {
        thermo.setCurrentTemp (66); // a is false
        thermo.setThresholdDiff (5);
        thermo.setOverride (true);
        thermo.setOverTemp (67); // c is false
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (12);
    }

    @Test
    // Major clause b is true, major clause c is true
    public void TestCACC3() {
        thermo.setCurrentTemp (66); // a is false
        thermo.setThresholdDiff (5);
        thermo.setOverride (true);
        thermo.setOverTemp (72); // to make c true
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (12);
    }

    @Test
    // Major clause b is false
    public void TestCACC4() {
        thermo.setCurrentTemp (66); // a is false
        thermo.setThresholdDiff (5);
        thermo.setOverride (false); // b is false
        thermo.setOverTemp (72);
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (12);
    }

    @Test
    // Major clause d is true
    public void TestCACC5() {
        thermo.setCurrentTemp (63);
        thermo.setThresholdDiff (5);
        thermo.setOverride (true);
        thermo.setOverTemp (72);
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (12);
    }

    @Test
    // Major clause d is false
    public void TestCACC6() {
        thermo.setCurrentTemp (63);
        thermo.setThresholdDiff (5);
        thermo.setOverride (true);
        thermo.setOverTemp (72);
        thermo.setMinLag (10);
        thermo.setTimeSinceLastRun (8); // d is false
    }
}

