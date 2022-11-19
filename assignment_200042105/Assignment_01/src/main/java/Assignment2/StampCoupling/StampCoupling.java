package Assignment2.StampCoupling;

@Stamp_Example(
        description = "Stamp Coupling occurs when one class sends an entire object or collection as parameter when" +
                "only a few members are needed to be accessed." +
                "Here, object of Employee class is sent as parameter of method " +
                "calculateTotalSalary() of calculateSalary class in order to access base_salary and bonus_salary."
)
public class StampCoupling {

    public void main(String[] args) {
        Employee emp = new Employee(101,10000,500);
        System.out.println(emp.total_salary);
    }

    public class Employee{
        public int employee_id;
        public int base_salary;
        public int bonus_salary;
        public int total_salary;

        public Employee(int employee_id, int base_salary, int bonus_salary)
        {
            this.employee_id = employee_id;
            this.base_salary = base_salary;
            this.bonus_salary = bonus_salary;
            this.total_salary = new CalculateSalary().calculateTotalSalary(this);
        }
    }

    public class CalculateSalary{
        public int calculateTotalSalary(Employee emp)
        {
            return emp.base_salary + emp.bonus_salary;
        }
    }
}

