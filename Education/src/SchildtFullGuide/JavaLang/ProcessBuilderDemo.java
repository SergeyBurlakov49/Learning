package SchildtFullGuide.JavaLang;

import java.io.*;

public class ProcessBuilderDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        String pythonPass = "C:/Users/megas/AppData/Local/Programs/Python/Python312/python.exe";
        String programPass = "C:/Users/megas/OneDrive/Рабочий стол/Hello World.py";
        ProcessBuilder pb = new ProcessBuilder(pythonPass, programPass);                                                // команда
        pb.redirectOutput(new File("File.txt"));                                                               // чекай корневую папку, огурец
        Process process = pb.start();                                                                                   // вывод с пайтона идет строго в файл
        process.waitFor();
    }
}
