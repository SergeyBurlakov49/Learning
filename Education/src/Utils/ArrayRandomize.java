package Utils;
import static Utils.ArraySwap.swap;
import static Utils.RandomInRange.randomInRange;

public class ArrayRandomize {

    public static <T> void randomize(T [] arr){
        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, randomInRange(0,arr.length - 1));
        }
    }

}
