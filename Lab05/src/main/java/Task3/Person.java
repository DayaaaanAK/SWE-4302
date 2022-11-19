package Task3;

public class Person {
    public String name;
    public String address;
    public int age;

    public void setAll(String name, String address, int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString()
    {
        String output = name + "\t" + age + "\t" + address;
        return output;
    }
}
