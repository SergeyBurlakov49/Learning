package StreamAPI.Parallel;

import java.util.stream.Stream;

/** Для работы с большими обьемами данных можно использовать многопоточность при помощи метода parallel().
 *  Рекомендовано это делать при количестве элементов >10000. */

public class StreamApiParallelDemo {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9).parallel().forEach((a) -> System.out.print(a + " "));          // но иногда можно такие баги захапать
        System.out.println();
        Stream.of(1,2,3,4,5,6,7,8,9).parallel().forEachOrdered((a) -> System.out.print(a + " "));   // метод forEachOrdered такое контрит
    }
}
