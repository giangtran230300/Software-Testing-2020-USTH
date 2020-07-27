import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PredicateCoverageTest {

    private Thermostat thermostat;
    private ProgrammedSettings programmedSettings;

    @Before
    public void Setup() {
        thermostat = new Thermostat();
    }

    @Test
    public void isEnergyEfficientTest1() {
        programmedSettings = new ProgrammedSettings(35);
        thermostat.setIsHeating(true);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(6);
        assertTrue(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest2() {
        programmedSettings = new ProgrammedSettings(70);
        thermostat.setIsHeating(true);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(6);
        assertTrue(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest3() {
        programmedSettings = new ProgrammedSettings(90);
        thermostat.setIsHeating(true);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(6);
        assertFalse(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest4() {
        programmedSettings = new ProgrammedSettings(70);
        thermostat.setIsHeating(true);
        thermostat.setOverride(true);
        thermostat.setThresholdDiff(6);
        assertFalse(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest5() {
        programmedSettings = new ProgrammedSettings(70);
        thermostat.setIsHeating(false);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(6);
        assertTrue(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest6() {
        programmedSettings = new ProgrammedSettings(40);
        thermostat.setIsHeating(false);
        thermostat.setOverride(true);
        thermostat.setThresholdDiff(6);
        assertTrue(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest7() {
        programmedSettings = new ProgrammedSettings(40);
        thermostat.setIsHeating(false);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(4);
        assertTrue(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest8() {
        programmedSettings = new ProgrammedSettings(40);
        thermostat.setIsHeating(false);
        thermostat.setOverride(true);
        thermostat.setThresholdDiff(4);
        assertFalse(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest9() {
        programmedSettings = new ProgrammedSettings(40);
        thermostat.setIsHeating(false);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(6);
        assertFalse(thermostat.isEnergyEfficient(programmedSettings));
    }
}