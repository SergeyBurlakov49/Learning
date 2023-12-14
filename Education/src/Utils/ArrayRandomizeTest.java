package Utils;

public class ArrayRandomizeTest {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        ArrayTransformF<Integer> randomize = ArrayRandomize::randomize;
        randomize.transform(arr);

        for (Integer i:arr) {
            System.out.print(i + " ");
        }
    }
}
