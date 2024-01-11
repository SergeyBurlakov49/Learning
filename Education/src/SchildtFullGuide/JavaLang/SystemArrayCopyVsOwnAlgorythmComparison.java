package SchildtFullGuide.JavaLang;
import static Utils.RandomInRange.*;

public class SystemArrayCopyVsOwnAlgorythmComparison {
    public static void main(String[] args) {
        int [] arr = new int[10000];
        for (int i = 0; i < args.length; i++) {
            arr[i] = randomInRange(0, 10000);
        }
        int [] arr1 = new int[10000];
        int [] arr2 = new int[10000];
        long myAlgorythmStarted = System.nanoTime();
        for (int i = 0; i < arr.length; i++) arr1[i] = arr[i];
        System.out.println("Time of my algorythm: " + (System.nanoTime() - myAlgorythmStarted));
        long arrayCopyStarted = System.nanoTime();
        System.arraycopy(arr, 0, arr2, 0, 10000);
        System.out.println("Time of arrayCopy(): " + (System.nanoTime() - arrayCopyStarted));
    }
}
