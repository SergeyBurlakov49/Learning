package ReflectionAnnotations.MyAnnotation;

import java.lang.annotation.Annotation;

public class InheritedAnnoDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println("Parent Annotations: ");
        for (Annotation annotation:parent.getClass().getAnnotations()) System.out.println(annotation);
        System.out.println();
        System.out.println("Child Annotations: ");
        for (Annotation annotation:child.getClass().getAnnotations()) System.out.println(annotation);
    }
}
