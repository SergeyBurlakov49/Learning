package MultiThreading;

public class VolatileDemo {
    public static void main(String[] args) {
        VolatileThread vt = new VolatileThread();
//        try {
//            vt.start();
//            Thread.sleep(1000);
//            vt.keepRunning = false;
//            System.out.println("Set keepRunning to false");
//            Thread.sleep(1000);
//            System.out.println("* nothing happened *");
//            vt.volatileKeepRunning = false;
//            System.out.println("Set volatileKeepRunning to false");
//        }
//        catch (InterruptedException exc){
//            exc.printStackTrace();
//
        vt.start();
        try {
            Thread.sleep(1000);
            vt.keepRunning = false;
            vt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
