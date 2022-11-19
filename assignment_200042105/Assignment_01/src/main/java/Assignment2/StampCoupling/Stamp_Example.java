package Assignment2.StampCoupling;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Stamp_Example {
    String description();
}
