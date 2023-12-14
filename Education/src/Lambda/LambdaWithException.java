package Lambda;

public class LambdaWithException {
    public static void main(String[] args) throws InterruptedException {
        VoidWithInterruptedExceptionF sleep = () -> {
            Thread.sleep(1000);         // см. реализуемый интерфейс
        };
        sleep.doSomething();
        System.out.println("...");
    }
}
