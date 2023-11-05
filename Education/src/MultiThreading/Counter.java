package MultiThreading;

public class Counter {

    private int x;

    public Counter(int x) {
        this.x = x;
    }

    public void synchronizedIncr(){
        synchronized (this) {
            x++;
        }
    }

    public void synchronizedDecr(){
        synchronized (this) {
            x--;
        }
    }

    public void Incr(){
        x++;
    }

    public void Decr(){
        x--;
    }

    public int getX(){
        return x;
    }

}
