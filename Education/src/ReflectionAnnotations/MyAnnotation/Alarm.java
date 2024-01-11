package ReflectionAnnotations.MyAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Alarms.class)
public @interface Alarm {
    String value();
}
