package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        MyUnaryFunction <Double> sqrt = (d) -> Math.sqrt(d);
        System.out.println(sqrt.func(9.0));

    }
}
