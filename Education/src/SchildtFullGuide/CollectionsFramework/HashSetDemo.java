package SchildtFullGuide.CollectionsFramework;

import java.util.ArrayList;
import java.util.HashSet;
import Utils.Timer;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        ArrayList<Person> arrayList = new ArrayList<>();
        String [] randomStrings = new String[1000000];
        for (int i = 0; i < randomStrings.length; i++) {
            char [] chars = new char[10];
            for (int j = 0; j < chars.length; j++) {
                chars[j] =(char) Utils.RandomInRange.randomInRange(97, 122);
            }
            randomStrings[i] = new String(chars);
        }
        Person person = null;
        for (int i = 0; i < randomStrings.length; i++) {
            if (i == 500000){
                person = new Person(randomStrings[i], Utils.RandomInRange.randomInRange(16,100));
                hashSet.add(person);
                arrayList.add(person);
            }
            else {
                hashSet.add(new Person(randomStrings[i], Utils.RandomInRange.randomInRange(16,100)));
                arrayList.add(new Person(randomStrings[i], Utils.RandomInRange.randomInRange(16,100)));
            }
        }
        Timer timer = Timer.createAndStart();
        hashSet.contains(person);
        System.out.println("HashSet time:" + timer.getTime());
        timer.reset();
        timer.start();
        arrayList.contains(person);
        System.out.println("ArrayList time:" + timer.getTime());
    }
}
