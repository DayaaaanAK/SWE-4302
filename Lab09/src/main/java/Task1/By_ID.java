package Task1;

import java.util.Comparator;

public class By_ID implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.ID.compareTo(s2.ID);
    }
}
