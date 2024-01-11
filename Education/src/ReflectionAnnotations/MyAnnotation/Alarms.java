package ReflectionAnnotations.MyAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Alarms {
    Alarm[] value();
}
