package Utils;

import static Utils.BubbleSort.bubbleSort;
import static Utils.RandomInRange.randomInRange;

public class BubbleSortDemo implements Comparable <BubbleSortDemo> {

    public int x;

    public BubbleSortDemo(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        BubbleSortDemo [] array = new BubbleSortDemo[100];
        for (int x = 0; x < array.length; x++){
            array[x] = new BubbleSortDemo(randomInRange(0,10));
        }
        bubbleSort(array);
        for (BubbleSortDemo bsd:array){
            System.out.println(bsd.x);
        }
    }

    @Override
    public int compareTo(BubbleSortDemo o) {
        return Integer.compare(this.x, o.x);
    }
}
