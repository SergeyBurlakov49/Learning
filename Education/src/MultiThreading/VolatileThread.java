package MultiThreading;

public class VolatileThread extends Thread{

    public boolean keepRunning;
    public volatile boolean volatileKeepRunning;

    VolatileThread (){
        keepRunning = true;
        volatileKeepRunning = true;
    }

    @Override
    public void run() {
        long counter = 0;
        while (keepRunning && volatileKeepRunning){
            counter++;
        }
        System.out.println(counter);
    }
}
