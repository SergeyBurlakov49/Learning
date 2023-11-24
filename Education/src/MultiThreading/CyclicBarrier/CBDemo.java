package MultiThreading.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CBDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Action());
        for (int i = 0; i < 5; i++) {
            BarrierVisitor.createAndRun(cyclicBarrier);
        }
    }

    static class BarrierVisitor implements Runnable{

        private CyclicBarrier cyclicBarrier;

        private BarrierVisitor(CyclicBarrier cyclicBarrier){
            this.cyclicBarrier = cyclicBarrier;
        }

        @Override
        public void run() {
            System.out.println("Thread is started");
            try {
                Thread.sleep(500 + Utils.RandomInRange.randomInRange(0,500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("pass the cyclic barrier");
        }

        public static void createAndRun(CyclicBarrier cyclicBarrier){
            new Thread(new BarrierVisitor(cyclicBarrier)).start();
        }

    }

    static class Action implements Runnable{


        @Override
        public void run() {
            System.out.println("Action");
        }
    }

}
