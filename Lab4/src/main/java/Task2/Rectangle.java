package Task2;

public class Rectangle implements Shape{
    public String shape_name;
    public Rectangle()
    {
        shape_name = "Task2.Rectangle";
    }
    @Override
    public String draw()
    {
        return "Task2.Rectangle has been drawn";
    }
    @Override
    public String get_name()
    {
        return shape_name;
    }
}
