package Task2;

public class Employee {
    private int ID;
    private String name;

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Employee(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void setID(int newID) {
        this.ID = newID;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return ID + "," + name;
    }
}
