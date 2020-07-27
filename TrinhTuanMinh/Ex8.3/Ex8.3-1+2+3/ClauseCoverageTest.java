import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClauseCoverageTest {

    private Thermostat thermostat;
    private ProgrammedSettings programmedSettings;

    @Before
    public void setUp() throws Exception {
        thermostat = new Thermostat();
    }

    @Test
    public void isEnergyEfficientTest1() {
        programmedSettings = new ProgrammedSettings(35);
        thermostat.setIsHeating(true);
        thermostat.setOverride(false);
        thermostat.setThresholdDiff(6);
        thermostat.setCurrentTemp(40);
        assertTrue(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest2() {
        programmedSettings = new ProgrammedSettings(35);
        thermostat.setIsHeating(true);
        thermostat.setOverride(true);
        thermostat.setThresholdDiff(6);
        assertFalse(thermostat.isEnergyEfficient(programmedSettings));
    }

    @Test
    public void isEnergyEfficientTest3() {
        programmedSettings = new ProgrammedSettings(70);
        thermostat.setIsHeating(false);
        thermostat.setOverride(true);
        thermostat.setThresholdDiff(6);
        thermostat.setCurrentTemp(55);
        assertFalse(thermostat.isEnergyEfficient(programmedSettings));
    }
}