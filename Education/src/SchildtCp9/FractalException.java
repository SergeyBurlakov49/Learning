package SchildtCp9;

public class FractalException extends Exception{

    public FractalException(int x) {
        super("Can't get fractal of " + x);
    }

}
