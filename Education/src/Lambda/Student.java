package Lambda;

import Utils.BubbleSort;

import java.util.Comparator;

public class Student implements Comparable<Student> {

//    public static Comparator<Student> comparatorByAge = (a, b) -> a.age - b.age;
    public static Comparator<Student> comparatorByAge = Comparator.comparingInt(a -> a.age);
    // создаем лямбду сравнения по возрасту             встроенный метод, возвращающий int компаратор, использующий
    //                                                  аргумента лямбду, которая получает int ключ из ссылочного типа

    public static Comparator<Student> comparatorByAverageMark = Comparator.comparingDouble((a) -> a.averageMark);
    public static Comparator<Student> comparatorByName = Comparator.comparing(a -> a.name);
    //                                                   а тут лямбда принимает любой тип, и любой тип дает в качестве
    //                                                   ключа

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

    public int compareTo(Student student, Comparator<Student> comparator){
        return comparator.compare(this, student);
    }

    public String toString(){
        return (name + ", " + age + " y.o., averrage mark - " + averageMark);
    }

    public static void main(String[] args) {
        Student [] arr = {new Student("Sophia", 18, 4.3), new Student("Vanya", 19, 3.7),
                          new Student("Petya", 17, 4.1), new Student("Gosha", 18, 4.8),};
        System.out.println("По имени");
        BubbleSort.bubbleSort(arr);
        for (Student student:arr) {
            System.out.println(student);
        }
        System.out.println("По оценкам");
        BubbleSort.bubbleSort(arr, Student.comparatorByAverageMark);
        for (Student student:arr) {
            System.out.println(student);
        }
        System.out.println("По возрасту");
        BubbleSort.bubbleSort(arr, Student.comparatorByAge);
        for (Student student:arr) {
            System.out.println(student);
        }
    }
}
