package Generics;

public class NumberBoxTest {
    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>(new Integer[]{1,2,3,4,5});
        NumberBox<Double> doubleNumberBox = new NumberBox<>(new Double[]{1.0,2.0,3.0,4.0,5.0});
        System.out.println(integerNumberBox.compare(doubleNumberBox));
    }
}
