package MultiThreading.DeadLock2;

public class A{

    public synchronized void a1(B ob){
        System.out.println("a1");
        ob.b2();
    }

    public synchronized void a2(){
        System.out.println("a2");
    }

}
