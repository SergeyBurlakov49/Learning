package MultiThreading.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {

    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        CDLReducer cdlReducer = new CDLReducer(countDownLatch);
        cdlReducer.thread.start();
        try {
            countDownLatch.await();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The end.");
    }

    static class CDLReducer implements Runnable{

        public CountDownLatch countDownLatch;
        public Thread thread;

        public CDLReducer(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
            thread = new Thread(this);
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
                System.out.println("Reduced CountDownLatch, there is " + countDownLatch.getCount() + " count amount now.");
            }
        }

    }

}
