package Assignment2.ContentCoupling;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Content_Example {
    String description();
}
