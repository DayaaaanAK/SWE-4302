package Assignment2.ControlCoupling;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Control_Example {
    String description();
}
