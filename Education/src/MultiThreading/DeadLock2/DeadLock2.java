package MultiThreading.DeadLock2;

public class DeadLock2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++){
                    a.a1(b);
                }
            }
        }.start();
        new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++){
                    b.b1(a);
                }
            }
        }.start();
    }
}
