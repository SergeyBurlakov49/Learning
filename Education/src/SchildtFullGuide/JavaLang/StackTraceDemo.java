package SchildtFullGuide.JavaLang;

public class StackTraceDemo {
    public static void main(String[] args) {
        StackTraceElement [] stes = Thread.currentThread().getStackTrace();
        for (StackTraceElement ste:stes) System.out.println(ste);
        System.out.println("getClassLoaderName() " + stes[1].getClassLoaderName());
        System.out.println("getClassName() " + stes[1].getClassName());
        System.out.println("getFileName() " + stes[1].getFileName());
        System.out.println("getLineNumber() " + stes[1].getLineNumber());
        System.out.println("getMethodName() " + stes[1].getMethodName());
        System.out.println("getModuleName() " + stes[1].getModuleName());
        System.out.println("getModuleVersion() " + stes[1].getModuleVersion());
        System.out.println("isNativeMethod() " + stes[1].isNativeMethod());
    }
}
