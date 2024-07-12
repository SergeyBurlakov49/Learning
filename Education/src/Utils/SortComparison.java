package Utils;

public class SortComparison {
    public static void main(String[] args) {
        Integer [] arr = new Integer[1000];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 100);
        }
        Integer [] arr2 = new  Integer[1000];
        System.arraycopy(arr,0,arr2,0,1000);
        Timer timer = Timer.createAndStart();
        BubbleSort.bubbleSort(arr);
        System.out.println(timer.getTime());
        timer.reset();
        timer.start();
        for (int i = 0; i < arr2.length - 1; i++){
            if (arr2[i] > arr2[i + 1]){
                ArraySwap.swap(arr2, i, i+1 );
                i = 0;
            }
        }
        System.out.println(timer.getTime());
    }
}
