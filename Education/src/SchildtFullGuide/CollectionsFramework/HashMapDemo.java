package SchildtFullGuide.CollectionsFramework;

import java.util.HashMap;

/** HashMap - это как HashSet, тока с двумя типами данных. */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("указывать","to point");
        dictionary.put("журнал","magazine");
        dictionary.put("завтрак","breakfast");
        dictionary.put("отношение","attitude");
        dictionary.put("уверенный","confident");
        if (dictionary.containsKey("указывать")) System.out.println("указывать - " + dictionary.get("указывать"));
        if (dictionary.containsKey("уверенный")) System.out.println("уверенный - " + dictionary.get("уверенный"));
    }
}
