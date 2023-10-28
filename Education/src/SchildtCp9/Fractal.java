package SchildtCp9;

public class Fractal {

    public static int fractal(int x) throws FractalException {
        if (x <= 0) throw new FractalException(x);
        return (x == 1) ? 1 : x * fractal(x - 1);
    }

}
