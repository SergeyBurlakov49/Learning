package MultiThreading;

public class SynchronizingDemo {

    public static void main(String[] args) {
        Counter nonSyncr = new Counter(0);
        Counter syncr = new Counter(0);

        Thread nonSyncrIncr = new Thread(){

            public void run(){
                for (int x = 0; x < 1000000; x++) nonSyncr.Incr();
            }

        };

        Thread nonSyncrDecr = new Thread(){

            public void run(){
                for (int x = 0; x < 1000000; x++) nonSyncr.Decr();

            }

        };

        Thread syncrIncr = new Thread(){

            public void run(){
                for (int x = 0; x < 1000000; x++) syncr.synchronizedIncr();
            }

        };

        Thread syncrDecr = new Thread(){

            public void run(){
                for (int x = 0; x < 1000000; x++) syncr.synchronizedDecr();
            }

        };

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
