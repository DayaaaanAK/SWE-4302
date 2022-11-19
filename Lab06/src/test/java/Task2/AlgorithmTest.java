package Task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest{
    @Test
    public void Test_DivisibleByThree()
    {
        DivisibleByThree dummy = new DivisibleByThree();

        Algorithm algorithm = new Algorithm();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);

        assertEquals(2,algorithm.CountIf(list,dummy));
    }

    @Test
    public void Test_IsOdd()
    {
        IsOdd dummy = new IsOdd();

        Algorithm algorithm = new Algorithm();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(16);
        list.add(6);

        assertEquals(1,algorithm.CountIf(list,dummy));
    }

    @Test
    public void Test_GreaterThanThree()
    {
        LengthGreaterThanThree dummy = new LengthGreaterThanThree();

        Algorithm algorithm = new Algorithm();

        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Beautiful");

        assertEquals(2,algorithm.CountIf(list,dummy));
    }
}
