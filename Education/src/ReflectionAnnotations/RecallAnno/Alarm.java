package ReflectionAnnotations.RecallAnno;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Repeatable(Alarms.class)
public @interface Alarm {
    String value();
}
