import Task1.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzyBuzzTest {
    @Test
    public void FizzBuzz_Test_0()
    {
        FizzBuzz dummy0 = new FizzBuzz();
        String expected = "Fizzbuzz";
        assertEquals(expected,dummy0.getFizzyBuzz(0));
    }

    @Test
    public void FizzBuzz_Test_3()
    {
        FizzBuzz dummy3 = new FizzBuzz();
        String expected = "Fizz";
        assertEquals(expected,dummy3.getFizzyBuzz(3));
    }

    @Test
    public void FizzBuzz_Test_7()
    {
        FizzBuzz dummy7 = new FizzBuzz();
        String expected = "Buzz";
        assertEquals(expected,dummy7.getFizzyBuzz(7));
    }

    @Test
    public void FizzBuzz_Test_21()
    {
        FizzBuzz dummy21 = new FizzBuzz();
        String expected = "Fizzbuzz";
        assertEquals(expected,dummy21.getFizzyBuzz(21));
    }

    @Test
    public void FizzBuzz_Test_22()
    {
        FizzBuzz dummy22 = new FizzBuzz();
        String expected = "Gotcha";
        assertEquals(expected,dummy22.getFizzyBuzz(22));
    }
}
