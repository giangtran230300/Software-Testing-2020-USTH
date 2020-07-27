/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestinghomework;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.After;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author oOo
 */
public class ThermostatTest {
    Thermostat thermo;
   ProgrammedSettings settings; 
    public ThermostatTest() {
    }
    
    @Before
    public void setUpClass() {
     thermo = new Thermostat();
     settings = new ProgrammedSettings();  
    }
   
    /**
     * Test of turnHeaterOn method, of class Thermostat.
     */
    @Test
    public void testTurnHeaterOnPCT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertTrue (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnPCF() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(15);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnCCAT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(15);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnCCAF() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(65);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(15);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnCCBCT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertTrue (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnCCBCF() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(false);  // clause b
      thermo.setOverTemp(50);  // clause c
      thermo.setMinLag(15);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnCCDT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertTrue (thermo.turnHeaterOn(settings));   
    }
    @Test
    public void testTurnHeaterOnCCDF() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(9);  // clause d
      assertFalse (thermo.turnHeaterOn(settings));   
    }
      
    public void testTurnHeaterOnTTFT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(60);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse(thermo.turnHeaterOn(settings));   
    }
    public void testTurnHeaterOnFTFT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(65);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(60);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse(thermo.turnHeaterOn(settings));   
    }
    public void testTurnHeaterOnFTTT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(65);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse(thermo.turnHeaterOn(settings));   
    }
    public void testTurnHeaterOnTTTF() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(63);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(8);  // clause d
      assertFalse(thermo.turnHeaterOn(settings));   
    }
    public void testTurnHeaterOnFFTT() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(65);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(false);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(12);  // clause d
      assertFalse(thermo.turnHeaterOn(settings));   
    }
    public void testTurnHeaterOnFTTF() {
      settings.setSetting(Period.MORNING, DayType.WEEKDAY, 69); 
      thermo.setPeriod(Period.MORNING);
      thermo.setDay(DayType.WEEKDAY);
      thermo.setCurrentTemp(65);  // clause a
      thermo.setThresholdDiff(5);   // clause a
      thermo.setOverride(true);  // clause b
      thermo.setOverTemp(70);  // clause c
      thermo.setMinLag(10);  // clause d
      thermo.setTimeSinceLastRun(8);  // clause d
      assertFalse (thermo.turnHeaterOn(settings));   
    }
    


}
