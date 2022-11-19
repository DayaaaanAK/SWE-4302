import Task3.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericsTest {
    @Test
    public void Test_person()
    {
        Person person_1 = new Person();
        Person person_2 = new Person();
        Person person_3 = new Person();

        person_1.setAll("Sian", "Uttara", 18);
        person_2.setAll("Akash","Kalyanpur",20);
        person_3.setAll("Wasif","Banasree",22);

        Printer<Person> dummy = new Printer<>();
        dummy.list.add(person_1);
        dummy.list.add(person_2);
        dummy.list.add(person_3);

        String expected = """
                Sian\t18\tUttara
                Akash\t20\tKalyanpur
                Wasif\t22\tBanasree
                """;
        assertEquals(expected,dummy.Print());
    }

    @Test
    public void Test_Student()
    {
        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();

        student_1.setAll("Sian", "Uttara", 18, 151);
        student_2.setAll("Akash","Kalyanpur",20,115);
        student_3.setAll("Wasif","Banasree",22,129);

        Printer<Student> dummy = new Printer<>();
        dummy.list.add(student_1);
        dummy.list.add(student_2);
        dummy.list.add(student_3);

        String expected = """
                Sian\t18\t151\tUttara
                Akash\t20\t115\tKalyanpur
                Wasif\t22\t129\tBanasree
                """;
        assertEquals(expected,dummy.Print());
    }

    @Test
    public void Test_Faculty()
    {
        Faculty faculty_1 = new Faculty();
        Faculty faculty_2 = new Faculty();
        Faculty faculty_3 = new Faculty();

        faculty_1.setAll("Sian", "Uttara", 18, "Lecturer");
        faculty_2.setAll("Akash","Kalyanpur",20,"Assistant Professor");
        faculty_3.setAll("Wasif","Banasree",22,"Professor");

        Printer<Faculty> dummy = new Printer<>();
        dummy.list.add(faculty_1);
        dummy.list.add(faculty_2);
        dummy.list.add(faculty_3);

        String expected = """
                Sian\t18\tLecturer\tUttara
                Akash\t20\tAssistant Professor\tKalyanpur
                Wasif\t22\tProfessor\tBanasree
                """;
        assertEquals(expected,dummy.Print());
    }
}
