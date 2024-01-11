package Utils;


public class Timer {

    private long surplus;
    private TimerStates state;
    private Timer pauseTimer;

    public Timer(){
        state = TimerStates.NOT_STARTED;
    }

    public void start(){
        switch (this.state) {
            case STARTED:
                throw new IllegalStateException("Timer is already started");
            case PAUSED:
                throw new IllegalStateException("Timer is paused");
            default:
                this.state = TimerStates.STARTED;
                this.surplus = -System.nanoTime();
        }
    }

    public long getTime(){
        return switch (this.state) {
            case NOT_STARTED -> throw new IllegalStateException("Timer isn't started");
            case STARTED -> System.nanoTime() + surplus;
            default -> System.nanoTime() + surplus - this.pauseTimer.getTime();
        };
    }

    public void pause(){
        switch (this.state){
            case PAUSED -> throw new IllegalStateException("Timer is paused");
            case NOT_STARTED -> throw new IllegalStateException("Timer isn't started");
            case STARTED -> {pauseTimer = new Timer();
                             pauseTimer.start();
                             this.state = TimerStates.PAUSED;
                             }
        }
    }

    public void unPause(){
        switch (this.state){
            case STARTED -> throw new IllegalStateException("Timer isn't paused");
            case NOT_STARTED -> throw new IllegalStateException("Timer isn't started");
            case PAUSED -> {surplus -= pauseTimer.getTime();
                            this.state = TimerStates.STARTED;
                            this.pauseTimer = null;}
        }
    }

    public void tryStart(){
        if(this.state == TimerStates.NOT_STARTED){
            this.state = TimerStates.STARTED;
            this.surplus = -System.nanoTime();
        }
    }

    public long tryGetTime(){
        return switch (this.state) {
            case NOT_STARTED -> -1;
            case STARTED -> System.nanoTime() + surplus;
            default -> System.nanoTime() + surplus - this.pauseTimer.getTime();
        };
    }

    public void tryPause(){
        if(this.state == TimerStates.STARTED){
            pauseTimer = new Timer();
            pauseTimer.start();
            this.state = TimerStates.PAUSED;
        }
    }

    public void tryUnPause(){
        if(this.state == TimerStates.PAUSED){
            surplus -= pauseTimer.getTime();
            this.state = TimerStates.STARTED;
            this.pauseTimer = null;}
    }

    public void reset(){
        state = TimerStates.NOT_STARTED;
    }

    public static Timer createAndStart(){
        Timer timer = new Timer();
        timer.start();
        return timer;
    }

    private enum TimerStates{
        STARTED, NOT_STARTED, PAUSED
    }
}
