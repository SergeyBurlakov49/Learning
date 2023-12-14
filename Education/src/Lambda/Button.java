package Lambda;

public class Button {

    private final VoidFunction function;

    public Button(VoidFunction function) {
        this.function = function;
    }

    public void press(){
        function.execute();
    }

    public static void main(String[] args) {
        Button button = new Button(() -> System.out.println("boo"));
        button.press();
    }

}
