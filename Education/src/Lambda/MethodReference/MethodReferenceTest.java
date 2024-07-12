package Lambda.MethodReference;

public class MethodReferenceTest {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,5};
        Array array = new Array(arr);
        array.forEach(Printer::printLine);
//        array.forEach((o) -> Printer.printLine(o));
    }
}
