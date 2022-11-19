package Task5;

public class Employee {
    private int ID;
    private String name;
    private int age;
    private long salary;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public long getSalary()
    {
        return salary;
    }

    public Employee(int ID, String name, int age, long salary) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return ID + "," + name + "," + age + "," + salary;
    }
}
