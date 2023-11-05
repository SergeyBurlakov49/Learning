package MultiThreading;

public class RunnableLoop implements Runnable{

    private char c;
    private int i;

    public RunnableLoop(char c, int i){
        this.c = c;
        this.i = (i <= 0) ? 1 : i;
    }

    @Override
    public void run() {
        for (int i = 0; i <= this.i; i++){
            System.out.println(this.c + " = " + i);
        }
    }

}
