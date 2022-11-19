package Task2;

public class Square implements Shape{
    public String shape_name;
    public Square()
    {
        shape_name = "Task2.Square";
    }
    @Override
    public String draw()
    {
        return "Task2.Square has been drawn";
    }
    @Override
    public String get_name()
    {
        return shape_name;
    }
}
