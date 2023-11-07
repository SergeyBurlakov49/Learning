package MultiThreading;

public class AtomicDemo {
    public static void main(String[] args) {
        AtomicCounter ac = new AtomicCounter(0);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 1000000; x++){
                    ac.inc();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 1000000; x++){
                    ac.dec();
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println(ac.getX());
    }
}
