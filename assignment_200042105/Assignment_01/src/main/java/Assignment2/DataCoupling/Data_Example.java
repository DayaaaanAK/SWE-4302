package Assignment2.DataCoupling;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Data_Example {
    String description();
}
