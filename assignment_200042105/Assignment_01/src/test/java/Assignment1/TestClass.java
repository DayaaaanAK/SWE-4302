package Assignment1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    @Test
    public void TestDate()
    {
        Date date = new Date(1,1,2022);
        assertEquals("1/1/2022",date.date());
    }

    @Test
    public void TestDay_1()
    {
        Date date = new Date(1,1,2022);
        assertEquals("2/1/2022",date.nextDate());
    }

    @Test
    public void TestDay_2()
    {
        Date date = new Date(15,2,2022);
        assertEquals("16/2/2022",date.nextDate());
    }

    @Test
    public void TestDay_3()
    {
        Date date = new Date(29,6,2022);
        assertEquals("30/6/2022",date.nextDate());
    }

    @Test
    public void TestMonth_1()
    {
        Date date = new Date(31,1,2022);
        assertEquals("1/2/2022",date.nextDate());
    }

    @Test
    public void TestMonth_2()
    {
        Date date = new Date(28,2,2022);
        assertEquals("1/3/2022",date.nextDate());
    }

    @Test
    public void TestMonth_3()
    {
        Date date = new Date(30,4,2022);
        assertEquals("1/5/2022",date.nextDate());
    }

    @Test
    public void TestLeapYear_1()
    {
        Date date = new Date(28,2,1900);
        assertEquals("1/3/1900",date.nextDate());
    }

    @Test
    public void TestLeapYear_2()
    {
        Date date = new Date(28,2,2000);
        assertEquals("29/2/2000",date.nextDate());
    }

    @Test
    public void TestLeapYear_3()
    {
        Date date = new Date(28,2,2022);
        assertEquals("1/3/2022",date.nextDate());
    }

    @Test
    public void TestLeapYear_4()
    {
        Date date = new Date(29,2,2020);
        assertEquals("1/3/2020",date.nextDate());
    }

    @Test
    public void TestYear()
    {
        Date date = new Date(31,12,2022);
        assertEquals("1/1/2023",date.nextDate());
    }
}
