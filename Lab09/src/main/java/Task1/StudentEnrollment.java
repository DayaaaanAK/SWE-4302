package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentEnrollment {
    public List<Student> studentList = new ArrayList<>();

    public void add(Student student)
    {
        studentList.add(student);
    }
    public void remove(Student student)
    {
        studentList.removeIf(dummy -> Objects.equals(student, dummy));
    }
    public Student get(Student student)
    {
        for(Student dummy : studentList)
        {
            if(Objects.equals(student, dummy))
            {
                return dummy;
            }
        }
        return null;
    }
    public void remove(String id)
    {
        Student student = null;
//        studentList.removeIf(dummy -> Objects.equals(id, dummy.ID));
        for(Student dummy : studentList)
        {
            if(Objects.equals(id, dummy.ID))
            {
                student = dummy;
            }
        }
        studentList.remove(student);
    }
    public Student get(String id)
    {
        for(Student dummy : studentList)
        {
            if(Objects.equals(id, dummy.ID))
            {
                return dummy;
            }
        }
        return null;
    }
    public String Print()
    {
        StringBuilder output = new StringBuilder();
        for(Student dummy : studentList)
        {
            output.append("ID: ").append(dummy.ID).append(" Name: ").append(dummy.name).append(" Program: ").append(dummy.program).append(" CGPA: ").append(dummy.CGPA).append("\n");
        }
        return String.valueOf(output);
    }
}
