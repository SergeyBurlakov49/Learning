package SchildtFullGuide.CollectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Elena", 33));
        personTreeSet.add(new Person("Boris", 42));
        personTreeSet.add(new Person("Igor", 17));
        personTreeSet.add(new Person("Anna", 47));
        personTreeSet.add(new Person("Daniil", 36));
        personTreeSet.add(new Person("Fedor", 28));
        personTreeSet.add(new Person("Grigory", 22));
        System.out.println(personTreeSet);
        System.out.println(personTreeSet.descendingSet());
        System.out.println(personTreeSet.tailSet(new Person("Fedor", 25)));
        System.out.println(personTreeSet.headSet(new Person("Fedor", 25)));
        TreeSet<Person> personTreeSet2 = new TreeSet<>(Person.ageComparator());
        personTreeSet2.add(new Person("Elena", 33));
        personTreeSet2.add(new Person("Boris", 42));
        personTreeSet2.add(new Person("Igor", 17));
        personTreeSet2.add(new Person("Anna", 47));
        personTreeSet2.add(new Person("Daniil", 36));
        personTreeSet2.add(new Person("Fedor", 28));
        personTreeSet2.add(new Person("Grigory", 22));
        System.out.println(personTreeSet2);
    }
}
