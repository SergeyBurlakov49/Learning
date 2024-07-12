package SchildtFullGuide.Serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Так нельзя писать, надо использовать try с ресурсами или close() */

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Person [] people = {new Person("Ivan", 18),
                new Person("Ekaterina", 23),
                new Person("Pyotr", 37),
                new Person("Sophia", 26),
        };
        File directory = new File("people");
        directory.mkdir();
        List.of(people).forEach((person -> {
            try {
                new ObjectOutputStream(new FileOutputStream("people/" + person.name + ".bin")).writeObject(person);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));

        ArrayList <Person> personArrayList = new ArrayList<>();
        List.of(directory.listFiles()).forEach((file -> {
            try {
                personArrayList.add((Person) new ObjectInputStream(new FileInputStream(file)).readObject());
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } ));
        personArrayList.forEach(a -> System.out.println(a.name + ", " + a.age));
    }
}
