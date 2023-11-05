package MultiThreading;

public class Store {

    private int item;


    public Store(){
        item = 0;
    }

    public synchronized void put(){
        while (item >= 3){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item++;
        System.out.println("Producer put one item. There is " + item + " items in store now.");
        notify();
    }

    public synchronized void get(){
        while (item <= 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item--;
        System.out.println("Consumer got one item. There is " + item + " items in store now.");
        notify();
    }

}
