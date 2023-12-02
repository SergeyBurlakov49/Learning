package MultiThreading;

public class SynchronizingDemo {

    public static void main(String[] args) {
        Counter nonSyncr = new Counter(0);
        Counter syncr = new Counter(0);

        Thread nonSyncrIncr = new Thread(() -> {for (int i = 0; i < 1000000; i++) nonSyncr.Incr();});
        Thread nonSyncrDecr = new Thread(() -> {for (int i = 0; i < 1000000; i++) nonSyncr.Decr();});
        Thread syncrIncr = new Thread(() -> {for (int i = 0; i < 1000000; i++) syncr.synchronizedIncr();});
        Thread syncrDecr = new Thread(() -> {for (int i = 0; i < 1000000; i++) syncr.synchronizedDecr();});

        nonSyncrIncr.start();
        nonSyncrDecr.start();
        try{
        nonSyncrIncr.join();
        nonSyncrDecr.join();
        }
        catch (InterruptedException exc){
            exc.printStackTrace();
        }
        System.out.println("No sync: " + nonSyncr.getX());

        syncrIncr.start();
        syncrDecr.start();
        try{
            syncrIncr.join();
            syncrDecr.join();
        }
        catch (InterruptedException exc){
            exc.printStackTrace();
        }
        System.out.println("Sync: " + syncr.getX());

    }

}
