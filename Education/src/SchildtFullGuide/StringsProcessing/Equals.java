package SchildtFullGuide.StringsProcessing;
import static Utils.EmptyString.*;

public class Equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Bye";
        String s4 = "HELLO";
        System.out.println("s1.equals(s2) - " + s1.equals(s2));
        System.out.println("s1.equals(s3) - " + s1.equals(s3));
        System.out.println("s1.equals(s4) - " + s1.equals(s4));
        System.out.println("s1.equalsIgnoreCase(s4) - " + s1.equalsIgnoreCase(s4));
        printEmptyString();

        String aboba = "aboba";
        String abobus = "abobus";
        System.out.println("aboba.regionMatches(0,abobus,0,4) - " + aboba.regionMatches(0,abobus,0,4));
        printEmptyString();

        System.out.println("aboba.startsWith(\"abob\") - " + aboba.startsWith("abob"));
        System.out.println("aboba.startsWith(\"abobus\") - " + aboba.startsWith("abobus"));
        System.out.println("abobus.endsWith(\"bus\") - " + abobus.endsWith("bus"));
        System.out.println("abobus.endsWith(\"ba\") - " + abobus.endsWith("ba"));
        printEmptyString();

        String s5 = "bebra";
        String s6 = new String(s5);
        String s7 = s5;
        System.out.println("s5.equals(s6) - " + s5.equals(s6));
        System.out.println("s5.equals(s7) - " + s5.equals(s7));
        System.out.println("s5 == s6 - " + (s5 == s6));
        System.out.println("s5 == s7 - " + (s5 == s7));
    }
}
