package SchildtFullGuide.StringsProcessing;

public class Search {
    public static void main(String[] args) {
        String s = "Never gonna give you up" +
                "Never gonna let you down" +
                "Never gonna run around and desert you" +
                "Never gonna make you cry" +
                "Never gonna say goodbye" +
                "Never gonna tell a lie and hurt you";
        for (int i = 1, b = 0;;){
            i = s.indexOf("Never", i);
            if (i == -1) {
                System.out.println(s.substring(b));
                break;
            }
            System.out.println(s.substring(b, i));
            b = i;
            i++;
        }
    }

}
