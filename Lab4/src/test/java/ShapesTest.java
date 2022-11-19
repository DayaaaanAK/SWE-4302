import Task2.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapesTest {
    @Test
    public void Test_Shape_Order_1()
    {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        Square square = new Square();
        shapes.add(circle);
        shapes.add(square);

        for(Shape dummy : shapes)
        {
            assertTrue(dummy instanceof Shape);
        }
    }

    @Test
    public void Test_Shape_Order_2()
    {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);

        for(Shape dummy : shapes)
        {
            assertTrue(dummy instanceof Shape);
        }
    }

    @Test
    public void Test_Shape_Order_3()
    {
        List<Shape> shapes = new ArrayList<>();
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        shapes.add(circle);
        shapes.add(square);
        shapes.add(rectangle);

        for(Shape dummy : shapes)
        {
            assertTrue(dummy instanceof Shape);
            String expected = dummy.get_name() + " has been drawn";
            assertEquals(expected,dummy.draw());
        }
    }
}
