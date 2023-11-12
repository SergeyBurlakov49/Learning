package MultiThreading;

public class VolatileDemo2 {

    public volatile static int x = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Changer());
        Thread t2 = new Thread(new Listener());
        t1.start();
        t2.start();
    }

    static class Changer implements Runnable{

        @Override
        public void run(){
            while (x <= 5){
                x++;
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException exc){
                    exc.printStackTrace();
                }

            }
        }

    }

    static class Listener implements Runnable{



        @Override
        public void run(){
            int y = x;
            while (x <= 5){
                if (y != x){
                    System.out.println(x);
                    y = x;
                }

            }
        }
    }

}
