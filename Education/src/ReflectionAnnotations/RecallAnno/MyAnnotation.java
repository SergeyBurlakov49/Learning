package ReflectionAnnotations.RecallAnno;


import java.lang.annotation.*;

@InheritedAnnotation                              // передается по наследованию
@Retention(RetentionPolicy.RUNTIME)     // до какого момента аннотация сохраняется в коде
@Target(ElementType.ANNOTATION_TYPE)    // к чему применяется данная аннотация
public @interface MyAnnotation {
}
