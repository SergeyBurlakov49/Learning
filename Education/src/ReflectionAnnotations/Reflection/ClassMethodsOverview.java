package ReflectionAnnotations.Reflection;

import java.lang.reflect.Field;

/** в какой-то момент я понял, что не хочу рассматривать все методы класса Class... */

public class ClassMethodsOverview {
    public static void main(String[] args) throws IllegalAccessException {


        System.out.println(Person.class.arrayType());                                                                   // возвращает тип массива



//        Class<?> superClass = Number.class;                                                                           ваще не работает
//        Class<? extends Number> subClass = Integer.class;
//        Class<? extends Number> resultClass = (Class<? extends Number>) subClass.asSubclass(superClass);
//        System.out.println("Result Class: " + resultClass.getName());

//        Person person = new Person("vova", 18);                                                                       тоже не работает ниче
//        Object object = Object.class.cast(person);
//        System.out.println(object.getClass());

        System.out.println(Person.class.componentType());                                                               // возвращает тип компонента

        System.out.println(Person.class.toGenericString());                                                             // "сигнатура" класса

        Field [] fields = Person.class.getDeclaredFields();
        for(Field field:fields) System.out.println(field);
        Field name = fields[0];
        name.setAccessible(true);                                                                                       // ну, сделать public
        // name.setDouble(new Person("vova", 18), 15.25);                                                               вот это вообще для сумасшедших
    }
}
