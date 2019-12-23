package co.vonod.annotations;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface info {

    public String name();

    public String phone() default "234";

    public String email() default "";
}
