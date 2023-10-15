package Utils;

public class ArraySwap {

    public static <T> void swap(T [] arr, int a, int b){
        T buffer = arr[a];
        arr[a] = arr[b];
        arr[b] = buffer;
    }

}
