package SchildtFullGuide.JavaLang;

public class RuntimeDemo {
    public static void main(String[] args) throws Exception{
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.availableProcessors());
        
//        runtime.exec("notepad.exe");
    }
}
