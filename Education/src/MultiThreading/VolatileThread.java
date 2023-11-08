package MultiThreading;

/** если добавить отдельный флаг volatileKeepRunning, то даже при изменении не volatile флага keepRunning поток
 * считывает это изменение и прерывается. Любопытно... */

public class VolatileThread extends Thread{

    public boolean keepRunning;
//    public volatile boolean volatileKeepRunning;

    VolatileThread (){
        keepRunning = true;
//        volatileKeepRunning = true;
    }

    @Override
    public void run() {
        long counter = 0;
        while (keepRunning /* && volatileKeepRunning */){
            counter++;
        }
        System.out.println(counter);
    }
}
