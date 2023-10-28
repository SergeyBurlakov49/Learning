package SchildtCp9;
import static SchildtCp9.Fractal.*;

public class FractalDemo {
    public static void main(String[] args) {
        long l = System.nanoTime();
        try {
            System.out.println(fractal(5));
            System.out.println(fractal(0));
        }
        catch (FractalException e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("foo");
        }
        long l2 = System.nanoTime();
        System.out.println(l2 + " - " + l + " = " + (l2 - l));
    }
}
