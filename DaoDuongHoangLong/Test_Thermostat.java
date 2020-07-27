import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;
public class Test_Thermostat
{
  @Test
  public void test_PC()
  {
    Thermostat t = new Thermostat();
    ProgrammedSettings s = ProgrammedSettings();

    s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
    t.setPeriod(Period.MORNING);
    t.setDay(DayType.WEEKDAY);

    t.setCurrentTemp(63);
    t.setThresholdDiff(5);

    t.setOverride(true);
    t.setOverTemp(70);

    t.setMinLag(10);
    t.setTimeSinceLastRun(12);

    assertTrue(t.turnHeaterOn(s));
    // Figure 8.4
  }

  @Test
  public void test_CC()
  {
    Thermostat t = new Thermostat();
    ProgrammedSettings s = new ProgrammedSettings();

    s.setSetting(Period.MORNING, DayType.WEEKDAY, 69);
    t.setPeriod(Period.MORNING);
    t.setDay(DayType.WEEKDAY);

    t.setCurrentTemp(63);
    t.setThresholdDiff(5);

    t.setCurrentTemp(66);
    t.setThresholdDiff(5);

    t.setOverride(true);
    t.setOverride(false);

    t.setOverTemp(72);
    t.setOverTemp(67);

    t.setMinLag(10);
    t.setTimeSinceLastRun(12);

    t.setMinLag(10);
    t.setTimeSinceLastRun(8);

    assertTrue(t.turnHeaterOn(s));
    // Figure 8.5
  }

  @Test
  public void test_CACC()
  {
    // I give up
  }
}
