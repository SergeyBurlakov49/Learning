package Utils;
import static Utils.ArrayRandomize.randomize;

public class ArrayRandomizeTest {
    public static void main(String[] args) {
        Integer [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        randomize(arr);
        for (Integer i:arr) {
            System.out.print(i + " ");
        }
    }
}
