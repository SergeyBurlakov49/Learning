package ReflectionAnnotations.Annotations;

public class Demo {
    public static void main(String[] args) {
        DeprecatedClass.deprecatedMethod();
        VoidF helloWorld = () -> System.out.println("hello world");
        helloWorld.doSomething();
    }

    @SuppressWarnings("unused")                                                                                         // аннотация контрит предупреждение о том, что метод не используется
    public static void unusedMeth(){}                                                                                   // список вариантов применения аннотации:
                                                                                                                        // https://gist.github.com/vegaasen/157fbc6dce8545b7f12c

    @SafeVarargs                                                                                                        // убирает предупреждение о небезопасности переменного числа
                                                                                                                        // обобщенных аргументов
    public static <T>  void varArgsMethod(T ... objects){
        for (T ob:objects) System.out.println(ob);
    }
}
