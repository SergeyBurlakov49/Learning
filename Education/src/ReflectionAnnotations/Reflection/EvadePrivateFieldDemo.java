package ReflectionAnnotations.Reflection;

import java.lang.reflect.Field;

public class EvadePrivateFieldDemo {
    public static void main(String[] args) {
        try {
            Person person = new Person("Ivan", 18);                                                          // ясно
            Class <? extends Person> personClass = person.getClass();                                                   // понятно
            Field field = personClass.getDeclaredField("name");                                                   // найти поле, даже если оно private (Declared)
            field.setAccessible(true);                                                                                  // сделать его открытым
            field.set(person, "Pyotr");                                                                                 // изменить значение поля у объекта
            System.out.println(person.getName());
        }
        catch (NoSuchFieldException | IllegalAccessException exc){
            exc.printStackTrace();
        }

    }
}
