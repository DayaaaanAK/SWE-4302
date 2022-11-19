package Task2;

public class Circle implements Shape{
    public String shape_name;
    public Circle()
    {
        shape_name = "Task2.Circle";
    }
    @Override
    public String draw() {
        return "Task2.Circle has been drawn";
    }
    @Override
    public String get_name()
    {
        return shape_name;
    }
}
