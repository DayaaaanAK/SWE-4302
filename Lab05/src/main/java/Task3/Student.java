package Task3;

public class Student extends Person{
    public int studentID;

    public void setAll(String name, String address, int age, int ID)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.studentID = ID;
    }

    @Override
    public String toString()
    {
        String output = name + "\t" + age + "\t" + studentID + "\t" + address;
        return output;
    }
}
