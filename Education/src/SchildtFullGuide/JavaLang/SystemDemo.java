package SchildtFullGuide.JavaLang;
import java.io.Console;

import static Utils.EmptyString.*;
import static java.lang.System.lineSeparator;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("копирогание массива");
        int [] iArr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] iArr2 = new int[10];
        System.arraycopy(iArr1, 2, iArr2, 2, 5);
        for (int i: iArr2) System.out.println(i);
        printEmptyString();

        Console console = System.console();                                                                             // хз зач надо

        System.out.println(System.currentTimeMillis());                                                                 // время в миллисекундах с 01.01.1970
        printEmptyString();

        System.gc();                                                                                                    // попытка вызвать сборщик мусора

        System.out.println(System.getenv());                                                                            // какая-то хрень, связанная с системными
        printEmptyString();                                                                                             // переменными, лучше не лезть сюда

        System.out.println(lineSeparator());                                                                            // ладно

        System.exit(228);                                                                                         // отвал фляги
    }
}
