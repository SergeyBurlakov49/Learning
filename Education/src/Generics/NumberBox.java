package Generics;

public class NumberBox <T extends Number> {

    public T [] arr;

    public NumberBox (T [] arr){
        this.arr = arr;
    }

    public double compare(NumberBox<?> anotherBox){
        double result = 0.0;
        for (T t : this.arr) {
            result += t.doubleValue();
        }
        for (int i = 0; i < anotherBox.arr.length; i++) {
            result -= anotherBox.arr[i].doubleValue();
        }
        return result;
    }
}
