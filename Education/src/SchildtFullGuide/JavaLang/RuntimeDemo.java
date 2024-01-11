package SchildtFullGuide.JavaLang;


/** см. также {@link AddShutDownHookDemo} и  {@link ProcessDemo}*/
public class RuntimeDemo {
    public static void main(String[] args) throws Exception{
        Runtime runtime = Runtime.getRuntime();             // объект типа Runtime привязывается к данной Java программе
        System.out.println(runtime.freeMemory());           // свободная память в байтах
        System.out.println(runtime.totalMemory());          // всего памяти в байтах
        System.out.println(runtime.availableProcessors());  // доступные потоки процессора
        runtime.gc();                                       // попытаться вызвать сборщик мусора
        runtime.exec("C:/Program Files/Google/Chrome/Application/chrome.exe");
        runtime.halt(-1);                              // завершить программу с данным кодом



    }
}
