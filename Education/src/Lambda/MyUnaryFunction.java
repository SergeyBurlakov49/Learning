package Lambda;

@FunctionalInterface
public interface MyUnaryFunction <T extends Number> {
    public double func(T num);
}
