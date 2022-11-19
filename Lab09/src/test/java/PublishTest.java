import Task1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublishTest {
    @Test
    public void Test_Sort_By_ID() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_4);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_1);

        ResultPublication dummy = new ResultPublication();
        By_ID id = new By_ID();

        System.out.println(dummy.publish(studentEnrollment.studentList,id));
    }

    @Test
    public void Test_Sort_By_Name() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_4);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_1);

        ResultPublication dummy = new ResultPublication();
        By_Name name = new By_Name();

        System.out.println(dummy.publish(studentEnrollment.studentList,name));
    }

    @Test
    public void Test_Sort_By_CGPA() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.7f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_4);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_1);

        ResultPublication dummy = new ResultPublication();
        By_CGPA cg = new By_CGPA();

        System.out.println(dummy.publish(studentEnrollment.studentList,cg));
    }

    @Test
    public void Test_Sort_By_CGPA_ID() throws InvalidStudentIDException {
        StudentEnrollment studentEnrollment = new StudentEnrollment();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();

        student_1.set("101","Nibir Kabir", ProgramType.CSE,3.77f);
        student_2.set("102","Zayed Hasan", ProgramType.SWE,3.59f);
        student_3.set("103","Mamunur Rahman", ProgramType.IT,3.77f);
        student_4.set("105","Dayan Ahmed", ProgramType.IT,3.95f);

        studentEnrollment.add(student_4);
        studentEnrollment.add(student_3);
        studentEnrollment.add(student_2);
        studentEnrollment.add(student_1);

        ResultPublication dummy = new ResultPublication();
        By_CGPA_ID cg = new By_CGPA_ID();

        System.out.println(dummy.publish(studentEnrollment.studentList,cg));
    }
}
