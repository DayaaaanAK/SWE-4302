package Task1;

import java.util.Comparator;

public class By_CGPA_ID implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int compare_id = s1.ID.compareTo(s2.ID);
        int dummy_1 = (int) (s1.CGPA * 100);
        int dummy_2 = (int) (s2.CGPA * 100);
        int compare_cg = dummy_2 - dummy_1;
        return (compare_cg == 0) ? compare_id : compare_cg;
    }
}