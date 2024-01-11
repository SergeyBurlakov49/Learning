package SchildtFullGuide.JavaLang;

public class AddShutDownHookDemo {
    public static void main(String[] args) {
        //Эта штука выполнится в конце работы программы
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("Closing Program")));
        System.out.println("Program started");
        System.out.println("...");
    }
}
