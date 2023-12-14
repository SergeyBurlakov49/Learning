package Lambda;

public class StringUtilizer {

    private final VoidStringFunction vsf;

    public StringUtilizer(VoidStringFunction vsf) {
        this.vsf = vsf;
    }

    public void utilize(String s){
        vsf.utilizeString(s);
    }

    public static void main(String[] args) {
        StringUtilizer printer = new StringUtilizer(System.out::println);
        printer.utilize("Hello world!");

    }
}
