package SchildtFullGuide.CollectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import Utils.Timer;

/** Результаты очень зависят от количества итераций, пробовал на 100000, 10000, 1000.*/

public class ArrayListvsLinkedListComparison {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        Timer arrayListAddInMid = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(5000, i);
        }
        System.out.println("Time wasted for adding in middle for arraylist: \t" + arrayListAddInMid.getTime());


        Timer linkedListAddInMid = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(5000, i);
        }
        System.out.println("Time wasted for adding in middle for linkedlist: \t" + linkedListAddInMid.getTime());

        Timer arrayListRemoveInMid = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(5000);
        }
        System.out.println("Time wasted for removing in middle for arraylist: \t" + arrayListRemoveInMid.getTime());

        Timer linkedListRemoveInMid = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(5000);
        }
        System.out.println("Time wasted for removing in middle for linkedlist: \t" + linkedListRemoveInMid.getTime());

        Timer arrayListRemoveInBeginning = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            arrayList.remove(0);
        }
        System.out.println("Time wasted for removing in beginning for arraylist: \t" + arrayListRemoveInBeginning.getTime());

        Timer linkedListRemoveInBeginning = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            linkedList.remove(0);
        }
        System.out.println("Time wasted for removing in beginning for linkedlist: \t" + linkedListRemoveInBeginning.getTime());

        Timer arrayListAddInBeginning = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        System.out.println("Time wasted for adding in beginning for arraylist: \t" + arrayListAddInBeginning.getTime());


        Timer linkedListAddInBeginning = Timer.createAndStart();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        System.out.println("Time wasted for adding in beginning for linkedlist: \t" + linkedListAddInBeginning.getTime());
    }
}
