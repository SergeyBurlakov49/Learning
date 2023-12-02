package Generics;

public class NumberBox <T extends Number> {

    public T [] array;

    public NumberBox (T[] arr){
        array = arr;
    }

    public double getSum(){
        if (array.length == 0) return 0;
        double sum = 0.0;
        for (T num:array){
            sum += num.doubleValue();
        }
        return sum;
    }

    public double getAverage(){
        if (array.length == 0) return 0;
        return (this.getSum() / array.length);
    }

    public double compareBySum(NumberBox<?> anotherBox){
        return (this.getSum() - anotherBox.getSum());
    }

    public double compareByAverage(NumberBox<?> anotherBox){
        return (this.getAverage() - anotherBox.getAverage());
    }

}
