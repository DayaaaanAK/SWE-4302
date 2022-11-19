package Task1;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        EmployeeDB dummy = new EmployeeDB();
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(102,"Hasnain Kabir"));
        employees.add(new Employee(105,"Dayan Ahmed Khan"));
        employees.add(new Employee(116,"Mamunur Rahman"));
        employees.add(new Employee(144,"Shadman Sakib"));
        employees.add(new Employee(153,"Zayed Hasan"));

        for (Employee emp : employees)
        {
            dummy.save(emp);
        }

        List<Employee> employeeList = dummy.Read();

        for(Employee emp : employeeList)
        {
            System.out.println(emp.toString());
        }
    }
}
