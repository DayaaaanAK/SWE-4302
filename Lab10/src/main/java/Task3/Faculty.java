package Task3;

import Task1.DevelopmentHistory;
import Task2.DevelopmentHistoryWithReviewer;

import java.lang.annotation.Documented;
import java.util.List;

@DevelopmentHistory(
        developer = "Dayan Ahmed Khan",
        tester = "Dayan Ahmed Khan"
)
public class Faculty {
    public String name;
    public String designation;
    public int salary;
    public List<Course> courseList;

    @DevelopmentHistoryWithReviewer(
            developer = "Dayan Ahmed Khan",
            tester = "Dayan Ahmed Khan",
            reviewers = {"Jubair Ibn Mostofa","Faisal Hossain"}
    )
    public Faculty(String name, String designation, int salary, List<Course> courseList)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.courseList = courseList;
    }

    @DevelopmentHistoryWithReviewer(
            developer = "Dayan Ahmed Khan",
            tester = "Dayan Ahmed Khan",
            reviewers = {"Jubair Ibn Mostofa","Faisal Hossain"}
    )
    public Faculty(String name, String designation, int salary)
    {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    @DevelopmentHistoryWithReviewer(
            developer = "Dayan Ahmed Khan",
            tester = "Dayan Ahmed Khan",
            reviewers = {"Faisal Hossain"}
    )
    public void teach(Course course)
    {

    }

    @DevelopmentHistoryWithReviewer(
            developer = "John Doe",
            tester = "John Doe",
            reviewers = {"Jubair Ibn Mostofa"}
    )
    public void research(String topic)
    {

    }
}
