package SchildtFullGuide.StringsProcessing;

public class Editing {
    public static void main(String[] args) {
        String s = "   Aboba   ";
        System.out.println(s.trim());
        System.out.println(s.trim().toLowerCase());
        System.out.println(s.trim().toUpperCase());
        String a = "a";
        String b = "b";
        String c = "c";
        System.out.println(String.join(", ", a, b, c));
    }
}
