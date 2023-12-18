package SchildtFullGuide.StringsProcessing;

public class Getters {
    public static void main(String[] args) {
        String string = "String";
        System.out.println("string - " + string);

        System.out.println("string.charAt(0) - " + string.charAt(0));

        char [] chars = new char[3];
        string.getChars(1, 4, chars, 0); // srcEnd - индекс ДО которого возвращаются символы
        System.out.println("string.getChars(1,4,0) - ");
        for(char ch:chars) System.out.println(ch);

        byte [] bytes = string.getBytes();
        System.out.println("string.getBytes()");
        for (byte b:bytes) System.out.println((char) b);

        double p = 3.1416;
        String str = String.valueOf(p);
        System.out.println("String.valueOf(p) - "+ str);
    }
}
