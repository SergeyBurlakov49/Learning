package SchildtFullGuide.StringsProcessing;
import static Utils.BubbleSort.*;
import static Utils.EmptyString.*;

public class CompareTo {
    public static void main(String[] args) {
        String[] wordsArray = {
                "apple",
                "banana",
                "orange",
                "grape",
                "kiwi",
                "peach",
                "melon",
                "lemon",
                "cherry",
                "strawberry"
        };
        bubbleSort(wordsArray);
        for (String s: wordsArray) System.out.println(s);
        printEmptyString();

        String boba = "boba";
        String aboba = "aboba";
        System.out.println("aboba.contains(boba) - " + aboba.contains(boba));
        System.out.println("boba.contains(aboba) - " + boba.contains(aboba));
        printEmptyString();

        String empty = "";
        System.out.println("empty.isEmpty() - " + empty.isEmpty());
        System.out.println("aboba.isEmpty() - " + aboba.isEmpty());
    }
}
