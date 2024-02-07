package SchildtFullGuide.CollectionsFramework;

import java.util.Comparator;
import java.util.Objects;


public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + ", " + age + " years.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Utils.HashCode.getHashCode(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    public static AgeComparator ageComparator(){
        return new AgeComparator();
    }

    private static class AgeComparator implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
}
