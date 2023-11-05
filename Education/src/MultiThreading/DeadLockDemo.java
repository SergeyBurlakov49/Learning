package MultiThreading;

public class DeadLockDemo {
    public static void main(String[] args) {

        Object resource1 = new Object();
        Object resource2 = new Object();

        class Thread1 implements Runnable{

            @Override
            public void run() {
                try {
                    synchronized (resource1) {
                        System.out.println("thread 1 doing something");
                        Thread.sleep(1000);
                        synchronized (resource2) {
                            System.out.println("thread 1 doing another thing");
                            Thread.sleep(1000);
                        }
                    }

                }
                catch (InterruptedException exc){
                    exc.printStackTrace();
                }
            }
        }

        class Thread2 implements Runnable{

            @Override
            public void run() {
                try {
                    synchronized (resource2) {
                        System.out.println("thread 2 doing something");
                        Thread.sleep(1000);
                        synchronized (resource1) {
                            System.out.println("thread 2 doing another thing");
                            Thread.sleep(1000);
                        }
                    }

                }
                catch (InterruptedException exc){
                    exc.printStackTrace();
                }
            }
        }

        new Thread(new Thread1()).start();
        new Thread(new Thread2()).start();

    }
}
