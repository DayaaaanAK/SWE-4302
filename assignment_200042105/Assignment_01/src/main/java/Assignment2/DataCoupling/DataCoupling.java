package Assignment2.DataCoupling;

@Data_Example(
        description = "Data Coupling occurs when necessary data are sent as parameters between two modules." +
                "Here, base_salary and bonus_salary of Employee class is sent as parameter of method " +
                "calculateTotalSalary() of calculateSalary class."
)
public class DataCoupling {

    public void main(String[] args) {
        Employee emp = new Employee(101,10000,500);
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
            this.total_salary = new CalculateSalary().calculateTotalSalary(base_salary,bonus_salary);
        }
    }

    public class CalculateSalary{
        public int calculateTotalSalary(int base, int bonus)
        {
            return base + bonus;
        }
    }
}
