package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITest {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5).filter(i -> i > 2).forEach(System.out::println);   // Stream.of() принимает переменное число аргументов, преобразует их в поток
                                                                                        // Это промежуточная операция, поскольку она возвращает поток

                                                                                        // stream.filter() принимает в качестве аргумента лямбду, принимающую
                                                                                        // то, что содержится в стриме (или его апкаст) и возвращающую boolean, и
                                                                                        // возвращает поток членов предыдущего потока, удовлетворяющих условию
                                                                                        // поэтому это тоже промежуточная операция

                                                                                        // stream.forEach принимает лямбду типа void, принимающую то, что
                                                                                        // содержится в стриме (или его апкаст), и выполняет операцию лямбды
                                                                                        // с каждым членом потока
                                                                                        // это - завершающая операция.
        Stream.of(new Student(19, "Masha"), new Student(18, "Sasha"), new Student(20, "Dasha")).sorted(
                (o1, o2) -> o1.getAge() - o2.getAge()).map(Student::getName).forEach(System.out::println);
        // тут вообще песня - поток студентов сортируется лямбдой по возрасту, на его основе генерируется поток имен, которые выводятся

        // List.of() возвращает неизменяемый список, похожий на ArrayList, но там какая-то секретная реализация у него есть жи

        int sum = Stream.of(1,2,3,4,5).collect(Collectors.summingInt((a) -> a));
        // короче, stream.collect() принимает в аргумент Collector, который как-то поток агрегирует в одну хрень какую-то
        // типа коллекции или инта, вот.

        Optional<Integer> i = Stream.of(1,2,3,4,5,6,7,8,9).reduce((a, b) -> a + b);
        System.out.println(i.get()); // и так еще можно


    }

    static class Student{

        private int age;
        private String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }
}
