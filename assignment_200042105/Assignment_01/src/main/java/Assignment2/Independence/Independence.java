package Assignment2.Independence;

@Independence_Example(
        description = "Independence Coupling is a form of coupling where two software modules are independent" +
                " of each other. Here Student and School classes have no dependency between them."
)
public class Independence {
    public class Student{
        int student_id;
        String student_name;
    }

    public class School{
        String school_name;
        String address;
    }
}