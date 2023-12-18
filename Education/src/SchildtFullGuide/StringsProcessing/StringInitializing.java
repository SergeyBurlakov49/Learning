package SchildtFullGuide.StringsProcessing;

public class StringInitializing {
    public static void main(String[] args) {
        char [] sequence = {'a', 'b', 'o', 'b', 'a'};
        String s1 = "bebra";
        System.out.println("s1: " + s1);

        String s2 = new String(s1);
        System.out.println("s2: " + s2);

        String s3 = new String(sequence);
        System.out.println("s3: " + s3);

        String s4 = new String(sequence, 1, 4);
        System.out.println("s4: " + s4);
    }
}
