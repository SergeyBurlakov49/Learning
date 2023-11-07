package MultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger x;

    public AtomicCounter(int x){
        this.x = new AtomicInteger(x);
    }

    public AtomicInteger getX(){
        return x;
    }

    public void inc(){
        x.incrementAndGet();
    }

    public void dec(){
        x.decrementAndGet();
    }

}
