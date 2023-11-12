package MultiThreading.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        int [] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Database database = new Database(data);
        database.startListening();
        for (int i = 0; i < 10; i++) {
            DataChanger dataChanger = new DataChanger(database, Integer.toOctalString(i));
            dataChanger.dataChangerThread.start();
        }
    }
}
