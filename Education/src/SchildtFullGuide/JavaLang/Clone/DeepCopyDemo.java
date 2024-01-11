package SchildtFullGuide.JavaLang.Clone;

import java.util.Arrays;

/** см. также {@link ShalowCopyDemo} */

public class DeepCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student2 sasha = new Student2("Alexander", 19, new int[]{5, 5, 4, 5, 3});
        Student2 clone = (Student2) sasha.clone();
        clone.age = 21;
        clone.name = "Ivan";
        clone.marks[0] = 3;
        System.out.println(sasha);  // тут все норм, они не ссылаются на один и тот же массив, потому что метод clone()
        System.out.println(clone);  // написан вручную
    }
}

class Student2 implements Cloneable {

    public String name;
    public int age;
    public int [] marks;

    public Student2(String name, int age, int[] marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int [] marks = new int[this.marks.length];
        System.arraycopy(this.marks, 0, marks, 0, marks.length);
        return (Object)  new Student2(this.name.substring(0), this.age, marks);
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
