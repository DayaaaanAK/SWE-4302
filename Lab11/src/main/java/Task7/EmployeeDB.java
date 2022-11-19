package Task7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDB {
    public void save(Employee employee)
    {
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("Task7.txt", true);
            fw.write(employee.toString() + "\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    // this code will give error if there is no file
    public void anotherSave()
    {
        try
        {
            Files.write(Paths.get("Task7.txt"), " the text ".getBytes(),
                    StandardOpenOption.APPEND);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void addEmployee(Employee employee, List<Employee> Employees)
    {
        Employees.add(employee);
    }

    public List<Double> increment(List<Employee> employees, double increment)
    {
        return employees.stream()
                .map(employee -> employee.getSalary()*(1 + increment/100))
                .collect(Collectors.toList());
    }
}

