package SchildtCp8;

public class InterfacesDemo2 implements Inherit{
    @Override
    public void meth1() {           // необходимо наследовать методы интерфейса-предка
        System.out.println("it's method 1");
    }

    @Override
    public void defMeth() {
        System.out.println("it's overriden default method");
    }

    @Override
    public void meth2() {
        System.out.println("it's method 2");
    }

    public void ownMeth(){
        System.out.println("InterfacesDemo2");
    }

    public static void main(String[] args) {
        InterfacesDemo2 iD2 = new InterfacesDemo2();
        Inherit i = iD2;
        i.meth1();
        i.meth2();
        i.defMeth();
        // i.ownMeth(); по интерфейсной ссылке можно использовать только методы интерфейса
    }
}
