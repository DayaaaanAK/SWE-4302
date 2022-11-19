package Task6;

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
            fw = new FileWriter("Task6.txt", true);
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
            Files.write(Paths.get("Task6.txt"), " the text ".getBytes(),
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

    public List<Employee> Read()
    {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fr = null;
        StringBuilder sb = null;
        try
        {
            fr = new FileReader("Task1.txt");
            BufferedReader br = new BufferedReader(fr);
            sb = new StringBuilder();
            String line;
            while((line = br.readLine()) != null)
            {
                sb.append(line);
                sb.append("\n");
            }
            br.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                fr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

        String[] line = sb.toString().split("\n");
        for(String s : line)
        {
            String[] value = s.split(",");
            Employee emp = new Employee(Integer.parseInt(value[0]),value[1],Integer.parseInt(value[2]),Integer.parseInt(value[3]));
            employeeList.add(emp);
        }
        return employeeList;
    }

    public List<Employee> salaryFilter(List<Employee> employees, long salary)
    {
        return employees.stream()
                .filter(employee -> employee.getSalary() > salary)
                .collect(Collectors.toList());
    }
}

