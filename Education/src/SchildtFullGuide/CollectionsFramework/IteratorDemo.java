package SchildtFullGuide.CollectionsFramework;


import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        MyCollection<Integer> integerMyCollection = new MyCollection<>(Integer.class);
        for (int i = 0; i < 10; i++) {
            integerMyCollection.arr[i] = i;
        }



        for (Integer i:integerMyCollection){                                                                            // for-each для моего класса, круто, да?
            System.out.println(i);
        }


    }
}
