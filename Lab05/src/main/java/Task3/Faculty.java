package Task3;

public class Faculty extends Person{
    public String designation;

    public void setAll(String name, String address, int age, String designation)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public String toString()
    {
        String output = name + "\t" + age + "\t" + designation + "\t" + address;
        return output;
    }
}
