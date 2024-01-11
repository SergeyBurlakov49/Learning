package Utils;

public class BubbleSort2 {
    public static <T extends Comparable<T>> void bubblesort (T[] arr){
        if (arr.length <= 1) return;
        for (int bubble = arr.length; bubble > 1; bubble--){
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[i - 1]) < 0){
                    T buffer = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = buffer;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer [] arr = new Integer[]{9, 8, 7, 6, 5, 28, 4, 3, 2, 1, 0};
        bubblesort(arr);
        for (int i:arr) System.out.println(i);
    }
}
