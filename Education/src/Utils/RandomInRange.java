package Utils;

public class RandomInRange {

    public static int randomInRange(int min, int max){
        if (min > max){
            int buffer = min;
            min = max;
            max = buffer;
        }
        double difference = max - min;
        return (int) (Math.round(difference * Math.random()) + min);
    }

}
