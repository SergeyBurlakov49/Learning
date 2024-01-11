package ReflectionAnnotations.MyAnnotation;

import java.lang.annotation.*;

@Alarm("10:00")
@Alarm("12:00")
@Alarm("14:00")
public class AlarmDemo {
    public static void main(String[] args) {
        Alarms alarms = AlarmDemo.class.getAnnotation (Alarms.class);                                                   // просто посмотри на этот синтаксис
        for (Alarm alarm: alarms.value()) System.out.println(alarm.value());
    }
}
