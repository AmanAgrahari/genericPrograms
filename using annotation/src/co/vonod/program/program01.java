package co.vonod.program;

import java.lang.annotation.Annotation;

import co.vonod.annotations.info;
import co.vonod.entity.person;

public class program01 {

    public static void main(final String[] args)

    {
        final person p1 = new person();

        final Class<? extends person> cls = p1.getClass();
        for (final Annotation a : cls.getAnnotations()) {
            if (a instanceof info) {
                final info i = (info) a;
                System.out.println("name=" + i.name());
                System.out.println("phone=" + i.phone());
                System.out.println("email=" + i.email());
            }
        }
    }
}
