package SchildtFullGuide.CollectionsFramework;

import java.util.LinkedHashSet;

/** LinkedHashSet содержит ссылки на начальный элемент а также на последующие для каждого хранимого объекта, что
 *  позволяет проводить итерации, в т.ч. циклом forEach.  */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        for (String s:lhs) System.out.println(s);
    }
}
