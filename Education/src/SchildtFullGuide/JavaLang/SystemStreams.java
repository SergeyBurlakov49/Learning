package SchildtFullGuide.JavaLang;

import java.io.*;

public class SystemStreams {
    public static void main(String[] args) throws IOException {
        System.setErr(new PrintStream(new FileOutputStream("log.txt")));                                          // поток System.err пошел сугубо в файл
        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException exc){
            exc.printStackTrace();
        }

        System.setOut(new PrintStream("Print.txt"));                                                            // теперь и sout идет в файл
        System.out.println("Абоба");

        System.setIn(new FileInputStream("2.txt"));
        byte [] bytes = new byte[128];
        System.out.println(System.in.read(bytes));
        for (int i = 0; i <= bytes.length; i++){
            if (bytes[i] == 0) break;
            System.out.print((char) bytes[i]);
        }
    }
}
