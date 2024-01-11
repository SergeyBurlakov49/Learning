package SchildtFullGuide.CollectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person1 = new Person("Ivan",19);
        Person person2 = new Person("Kirill",21);

        personArrayList.add(person1);
        personArrayList.add(person2);



        System.out.println(personArrayList.get(0));
        System.out.println(personArrayList.get(1));

        personArrayList.remove(0);
        System.out.println(personArrayList.get(0));

        System.out.println(personArrayList.size());

        System.out.println(personArrayList.contains(person2));
        System.out.println(personArrayList.indexOf(person2));

        personArrayList.clear();

        System.out.println(personArrayList.isEmpty());



    }
}
