import Task5.Employee;
import Task5.EmployeeDB;

public class Solution {
    public static void main(String[] args) {
        EmployeeDB dummy = new EmployeeDB();
        Employee emp = new Employee(105,"Dayan Ahmed Khan",22,25000);

        dummy.save(emp);
    }
}
