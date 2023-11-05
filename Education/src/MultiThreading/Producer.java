package MultiThreading;

public class Producer implements Runnable{

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    private void produce(){
        store.put();
    }


    @Override
    public void run() {
        for (int i = 0; i < 6; i++){
            produce();
        }
    }
}
