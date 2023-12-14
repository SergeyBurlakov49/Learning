package Utils;

import java.util.function.Supplier;

public class RandomTest {

    public static void main(String[] args) {
        System.out.println(randomTest(Math::random));
    }

    public static double randomTest(Supplier<Double> randomFunction){
        double result = 0.0;
        for (int i = 0; i < 100000000; i++) {
            result += randomFunction.get();
        }
        System.out.println(result);
        return Math.abs(0.5 - (result / 100000000));
    }

}
