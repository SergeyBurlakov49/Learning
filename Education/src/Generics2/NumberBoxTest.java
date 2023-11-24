package Generics2;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>(new Integer[]{1, 2, 3, 4, 5});
        NumberBox<Double> doubleNumberBox = new NumberBox<>(new Double[]{1., 2., 3., 4., 5.});
        System.out.println(integerNumberBox.getSum());
        System.out.println(integerNumberBox.getAverage());
        System.out.println(doubleNumberBox.getSum());
        System.out.println(doubleNumberBox.getAverage());
        System.out.println(integerNumberBox.compareBySum(doubleNumberBox));
        System.out.println(integerNumberBox.compareByAverage(doubleNumberBox));

    }
}
