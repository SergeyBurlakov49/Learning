package Utils;

import static Utils.BubbleSort.bubbleSort;

public class BubbleSortDemo implements Comparable <BubbleSortDemo> {

    public int x;

    public BubbleSortDemo(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        BubbleSortDemo [] array = {new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
                new BubbleSortDemo( (int)(Math.random()*15) ),
        };
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
