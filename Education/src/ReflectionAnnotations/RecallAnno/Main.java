package ReflectionAnnotations.RecallAnno;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Аннотации родителя:");
        List.of(parent.getClass().getAnnotations()).forEach(System.out::println);
        Child child = new Child();
        System.out.println("\nАннотации наследника:");
        List.of(child.getClass().getAnnotations()).forEach(System.out::println);
    }
}
