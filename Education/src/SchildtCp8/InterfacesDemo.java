package SchildtCp8;

public class InterfacesDemo implements I{

    @Override
    public void meth1() {
        System.out.println("method 1");
    }

    @Override
    public void defMeth() {
        I.super.defMeth();      // использогание дефолтной реализации
    }

    public static void main(String[] args) {
        InterfacesDemo iD = new InterfacesDemo();
        iD.meth1();
        iD.defMeth();
    }
}
