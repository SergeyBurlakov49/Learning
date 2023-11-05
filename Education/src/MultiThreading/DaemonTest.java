package MultiThreading;

public class DaemonTest {
    public static void main(String[] args) {
        ThreadLoop tl = new ThreadLoop('i', 10);
        tl.setDaemon(true); // потоки-демоны прерываются по завершению основных потоков
        tl.start();
        System.out.println("over");
    }
}
