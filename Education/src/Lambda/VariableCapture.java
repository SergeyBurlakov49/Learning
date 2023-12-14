package Lambda;

import java.util.function.Supplier;

public class VariableCapture {
    public static void main(String[] args) {
        double pi = 3.1416;
        Supplier<Double> getPi = () -> {
//            pi++;                             переменные, захваченные из внешней области, не могут быть изменены.
            return pi;                          // но могут быть прочитаны.
        };
    }
}
