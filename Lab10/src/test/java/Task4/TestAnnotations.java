package Task4;

import Task1.DevelopmentHistory;
import Task2.DevelopmentHistoryWithReviewer;
import Task3.Faculty;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestAnnotations {
    @Test
    public void methodTest()
    {
        Object faculty = new Faculty("Mohsinul Kabir Shanto","AP",90000);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<String> actualMethodNames = new ArrayList<>();

        for(Method m : methods)
        {
            System.out.println(m.getName());
            boolean AnnotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(AnnotationPresent)
            {
                System.out.println(m.getDeclaredAnnotations().length);
                actualMethodNames.add(m.getName());
            }
        }

        assertTrue(Arrays.asList("teach","research").containsAll(actualMethodNames));
    }

    @Test
    public void constructorTest()
    {
        Object faculty = new Faculty("Mohsinul Kabir Shanto","AP",90000);
        Constructor[] constructors = faculty.getClass().getConstructors();
        List<String> actualConstructorNames = new ArrayList<>();

        for(Constructor c : constructors)
        {
            System.out.println(c.getName());
            boolean AnnotationPresent = c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(AnnotationPresent)
            {
                System.out.println(c.getDeclaredAnnotations().length);
                actualConstructorNames.add(c.getName());
            }
        }

        assertTrue(Arrays.asList("Task3.Faculty","Task3.Faculty").containsAll(actualConstructorNames));
    }

    @Test
    public void classTest()
    {
        Object faculty = new Faculty("Mohsinul Kabir Shanto","AP",90000);
        boolean annotationPresent = faculty.getClass().isAnnotationPresent(DevelopmentHistory.class);
        assertTrue(annotationPresent);
    }

    @Test
    public void methodTest_2()
    {
        Object faculty = new Faculty("Mohsinul Kabir Shanto","AP",90000);
        Method[] methods = faculty.getClass().getDeclaredMethods();
        List<DevelopmentHistoryWithReviewer> annotationValues = new ArrayList<>();

        for(Method m : methods)
        {
            System.out.println(m.getName());
            boolean AnnotationPresent = m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(AnnotationPresent)
            {
                DevelopmentHistoryWithReviewer dummy = m.getAnnotation(DevelopmentHistoryWithReviewer.class);
                if(dummy != null)
                {
                    System.out.println(dummy.version());
                    System.out.println(dummy.developer());
                    System.out.println(dummy.tester());
                    System.out.println(Arrays.toString(dummy.reviewers()));
                }
            }
        }

//        assertTrue(Arrays.asList("teach","research").containsAll(annotationValues));
    }

}
