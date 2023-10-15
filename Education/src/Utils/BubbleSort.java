package Utils;

import static Utils.ArraySwap.swap;

public class BubbleSort {
    public static <C extends Comparable<C>> void bubbleSort (C [] arr){
        if (arr.length <= 1) return;
        int bubble = arr.length;
        while (bubble > 1){
            for (int i = 1; i < bubble; i++){
                if (arr[i].compareTo(arr[i-1]) < 0) swap(arr, i, i-1);
            }
            bubble--;
        }
    }



}
