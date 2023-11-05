package MultiThreading;

public class ConsumerProducerDemo {
    public static void main(String[] args) {
        Store store = new Store();
        Consumer consumer = new Consumer(store);
        Producer producer = new Producer(store);
        Thread consumerThread = new Thread(consumer);
        Thread produserThread  = new Thread(producer);
        consumerThread.start();
        produserThread.start();
    }
}
