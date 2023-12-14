package Lambda;

import java.util.Comparator;

public class Student implements Comparable<Student>{

//    public static Comparator<Student> comparatorByAge = (a, b) -> a.age - b.age;
    public static Comparator<Student> comparatorByAge = Comparator.comparingInt(a -> a.age);
    public String name;
    public int age;
    public double averageMark;

    public Student(String name, int age, double averageMark) {
        this.name = name;
        this.age = age;
        this.averageMark = averageMark;
    }

    @Override
    public int compareTo(Student student) {
        return this.name.compareTo(student.name);
    }

}
