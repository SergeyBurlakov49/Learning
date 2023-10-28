package SchildtCp8;

public interface I {
    int constant = 0; // константы
    void meth1();
    default void defMeth(){
        System.out.println("it's default method");
        privateMeth();
    }

    private void privateMeth(){
        System.out.println("it's private method");
    }
}
