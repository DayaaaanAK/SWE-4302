package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {
    @Test
    public void TestCase_DayLabor()
    {
       DayLabor dummy = new DayLabor(100,300);

       assertEquals(0.0,dummy.YearlyVacation());
       assertEquals(14400.0,dummy.YearlyWage());
    }

    @Test
    public void TestCase_Permanent()
    {
        Permanent dummy = new Permanent(30000,311);

        assertEquals(29.33,dummy.YearlyVacation());
        assertEquals(1188000.0,dummy.YearlyWage());
    }

    @Test
    public void TestCase_MonthlyContract()
    {
        MonthlyContract dummy = new MonthlyContract(30000,365);

        assertEquals(21.0,dummy.YearlyVacation());
        assertEquals(360000.0,dummy.YearlyWage());
    }

    @Test
    public void TestCase_InstanceType()
    {
        DayLabor dayLaborer = new DayLabor(100,300);
        Permanent permanent = new Permanent(30000,311);
        MonthlyContract monthly = new MonthlyContract(30000,365);

        assertInstanceOf(Worker.class, dayLaborer);
        assertInstanceOf(Worker.class, permanent);
        assertInstanceOf(Worker.class, monthly);
    }
}
