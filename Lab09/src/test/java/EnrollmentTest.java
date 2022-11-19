import Task1.InvalidStudentIDException;
import Task1.ProgramType;
import Task1.Student;
import Task1.StudentEnrollment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EnrollmentTest {
    @Test
    public void TestAdd() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_1);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_4);

        assertEquals(student_1,studentEnrollment.studentList.get(0));
        assertEquals(student_2,studentEnrollment.studentList.get(1));
        assertEquals(student_3,studentEnrollment.studentList.get(2));
        assertEquals(student_4,studentEnrollment.studentList.get(3));
    }

    @Test
    public void TestRemove_Student() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_1);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_4);

        studentEnrollment.remove(student_2);

        assertEquals(3,studentEnrollment.studentList.size());
    }

    @Test
    public void TestRemove_ID() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_1);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_4);

        studentEnrollment.remove("101");
        studentEnrollment.remove("103");

        assertEquals(2,studentEnrollment.studentList.size());
    }

    @Test
    public void Get_ID() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_1);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_4);

        assertEquals(student_1,studentEnrollment.get("101"));
        assertEquals(student_4,studentEnrollment.get("105"));
    }

    @Test
    public void Get_Student() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_1);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_4);

        assertEquals(student_2,studentEnrollment.get(student_2));
        assertEquals(student_3,studentEnrollment.get(student_3));
    }

    @Test
    public void TestPrint() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_1);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_4);

        String expected = student_1.Print();
        expected += student_2.Print();
        expected += student_3.Print();
        expected += student_4.Print();

        assertEquals(expected,studentEnrollment.Print());
    }
}
