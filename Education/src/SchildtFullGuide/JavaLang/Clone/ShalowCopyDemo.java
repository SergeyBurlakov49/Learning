package SchildtFullGuide.JavaLang.Clone;

import java.util.Arrays;

/** см. также {@link DeepCopyDemo} */

public class ShalowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student sasha = new Student("Alexander", 19, new int[]{5, 5, 4, 5, 3});
        Student clone = (Student) sasha.clone();
        clone.age = 21;
        clone.name = "Ivan";
        clone.marks[0] = 3;
        System.out.println(sasha);  // у оригинала меняется ссылочный тип при редактировании клона (массив че то меняется, а строка нет, хз)
        System.out.println(clone);  // это все происходит из-за поверхностного клонирования
    }
}

class Student implements Cloneable {

    public String name;
    public int age;
    public int [] marks;

    public Student(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
