package Task6;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        EmployeeDB dummy = new EmployeeDB();
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(102,"Hasnain Kabir",20,25000));
        employees.add(new Employee(105,"Dayan Ahmed Khan",22,80000));
        employees.add(new Employee(116,"Mamunur Rahman",21,30000));
        employees.add(new Employee(144,"Shadman Sakib",22,100000));
        employees.add(new Employee(153,"Zayed Hasan",18,15000));

        for (Employee emp : employees)
        {
            dummy.save(emp);
        }

        List<Employee> EmployeeList = dummy.salaryFilter(employees,25000);

        for(Employee emp : EmployeeList)
        {
            System.out.println(emp.toString());
        }

    }
}
