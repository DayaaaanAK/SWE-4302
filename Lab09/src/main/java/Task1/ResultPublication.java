package Task1;

import java.util.Comparator;
import java.util.List;

public class ResultPublication{
    public String publish(List<Student> students, Comparator<Student> obj)
    {
        students.sort(obj);
        StringBuilder output = new StringBuilder();
        for(Student dummy : students)
        {
            output.append(dummy.Print());
        }
        return output.toString();
    }
}
