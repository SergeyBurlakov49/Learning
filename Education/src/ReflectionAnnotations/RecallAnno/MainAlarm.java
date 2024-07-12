package ReflectionAnnotations.RecallAnno;


import java.lang.annotation.Annotation;

@Alarm("12:00")
@Alarm("14:00")
@Alarm("16:00")
public class MainAlarm {
    public static void main(String[] args) {
        Alarms annotation = MainAlarm.class.getAnnotation(Alarms.class);
        for (Alarm alarm:annotation.value()) System.out.println(alarm.value());
    }
}
