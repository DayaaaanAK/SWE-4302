package Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericStackTest {
    @Test
    public void TestCase_1()
    {
        GenericMaxStack<Integer> dummy = new GenericMaxStack<>();

        dummy.Push(3);
        dummy.Push(5);
        dummy.Push(2);

        assertEquals(5,dummy.max());
    }

    @Test
    public void TestCase_2()
    {
        GenericMaxStack<Integer> dummy = new GenericMaxStack<>();

        dummy.Push(2);
        dummy.Push(1);
        dummy.Push(2);
        dummy.Push(5);

        dummy.pop();
        assertEquals(2,dummy.max());

        dummy.pop();
        assertEquals(2,dummy.max());
    }

    @Test
    public void TestCase_3()
    {
        GenericMaxStack<Double> dummy = new GenericMaxStack<>();

        dummy.Push(49.75);
        dummy.Push(23.54);
        dummy.Push(100.0);

        assertEquals(100.0,dummy.max());

        dummy.pop();
        assertEquals(49.75,dummy.max());
    }

    @Test
    public void TestCase_4()
    {
        GenericMaxStack<String> dummy = new GenericMaxStack<>();

        dummy.Push("OOC is bad");
        dummy.Push("Nothing to understand");
        dummy.Push("Try hard");

        assertEquals("Try hard",dummy.max());

        dummy.pop();
        assertEquals("OOC is bad",dummy.max());
    }
}
