package SchildtFullGuide.JavaLang;

import java.io.IOException;
import java.util.stream.Stream;

public class ProcessDemo {
    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("notepad.exe");
        Stream<ProcessHandle> processHandleStream = process.children();
        processHandleStream.forEach(System.out::println);
    }
}
