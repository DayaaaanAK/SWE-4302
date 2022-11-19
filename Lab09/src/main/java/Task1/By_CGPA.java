package Task1;

import java.util.Comparator;

public class By_CGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int dummy_1 = (int) (s1.CGPA * 100);
        int dummy_2 = (int) (s2.CGPA * 100);
        return dummy_2 - dummy_1;
    }
}
