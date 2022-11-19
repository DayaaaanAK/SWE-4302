package Assignment2.ContentCoupling;

@Content_Example(
        description = "Content Coupling occurs when one module accesses and modifies data of another module. " +
                "Here, ContentCoupling class is modifying data of Employee class."
)
public class ContentCoupling {

    public void main(String[] args) {
        Employee emp = new Employee();
        emp.employee_id = 101;
    }

    public class Employee{
        public int employee_id;
        public String designation;
        public int salary;
    }
}
