package MultiThreading.Semaphore;

import java.util.concurrent.Semaphore;

public class Database {

    public int [] data;
    public Semaphore dataSemaphore;
    public SemaphoreListener semaphoreListener;

    public Database(int [] data){
        this.data = data;
        dataSemaphore = new Semaphore(1, true);
    }

    static class SemaphoreListener extends Thread{

        private Database database;

        public SemaphoreListener(Database database){
            this.database = database;
        }

        @Override
        public void run(){
            int availablePermits = database.dataSemaphore.availablePermits();
            switch (availablePermits){
                case 0:
                    System.out.println("Semaphore is acquired.");
                    break;
                case 1:
                    System.out.println("Semaphore is released");
                    break;
            }
            System.out.println("Current queue is " + database.dataSemaphore.getQueueLength());
            for(;;){
                if (availablePermits != database.dataSemaphore.availablePermits()){
                    availablePermits = database.dataSemaphore.availablePermits();
                    switch (availablePermits){
                        case 0:
                            System.out.println("Semaphore is acquired.");
                            break;
                        case 1:
                            System.out.println("Semaphore is released");
                            break;
                    }
                }

            }
        }

    }

    public void startListening(){
        semaphoreListener = new SemaphoreListener(this);
        semaphoreListener.setDaemon(true);
        semaphoreListener.start();
    }

}
