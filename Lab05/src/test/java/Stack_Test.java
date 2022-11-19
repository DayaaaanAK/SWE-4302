import Bonus.Generic_Stack;
import Task2.MinStack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    @Test
    public  void TestCase_1()
    {
        MinStack dummy = new MinStack();

        dummy.push(3);
        dummy.push(2);
        dummy.push(5);
        dummy.push(1);

        assertEquals(1,dummy.min());
    }

    @Test
    public  void TestCase_2()
    {
        MinStack dummy = new MinStack();

        dummy.push(3);
        dummy.push(2);
        dummy.push(5);
        dummy.push(1);

        dummy.pop();

        assertEquals(2,dummy.min());
    }

    @Test
    public  void TestCase_3()
    {
        MinStack dummy = new MinStack();

        dummy.push(12);
        dummy.push(3);
        dummy.push(4);

        assertEquals(3,dummy.min());
    }

    @Test
    public void TestCase_4()
    {
        Generic_Stack<Integer> dummy = new Generic_Stack<>();

        dummy.Push(12);
        dummy.Push(3);
        dummy.Push(4);

        assertEquals(3,dummy.min());
    }
}
