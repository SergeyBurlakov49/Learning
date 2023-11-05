package MultiThreading;

public class TLRLTest {
    public static void main(String[] args) {
        ThreadLoop tl = new ThreadLoop('i', 10);
        RunnableLoop rl = new RunnableLoop('k', 10);
        Thread thread = new Thread(rl);
        tl.start();
        thread.start();
        System.out.println("Main over");
    }
}
