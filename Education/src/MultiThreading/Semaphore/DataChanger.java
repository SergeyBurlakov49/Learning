package MultiThreading.Semaphore;

public class DataChanger implements Runnable{

    Database database;
    Thread dataChangerThread;
    String name;

    public DataChanger(Database database, String name){
        this.database = database;
        dataChangerThread = new Thread(this);
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread " + name + " is trying to acquire the semaphore");
            database.dataSemaphore.acquire();
            System.out.println("Thread " + name + " acquired the semaphore");
            for (int i = 0; i < database.data.length; i++){
                database.data[i]++;
            }
            Thread.sleep(333);
            System.out.println("Thread " + name + " changed the database");
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            database.dataSemaphore.release();
            System.out.println("Thread " + name + " released the semaphore");
        }
    }
}
