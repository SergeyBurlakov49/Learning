package MultiThreading.DeadLock2;

public class B{

    public synchronized void b1(A ob){
        System.out.println("b1");
        ob.a2();
    }

    public synchronized void b2(){
        System.out.println("b2");
    }

}
