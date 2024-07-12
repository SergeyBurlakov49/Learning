package SchildtFullGuide.JavaUtil;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();           // есть конструктор с сидом, прикольно
        for (int i = 0; i < 10; i++) System.out.println(random.nextDouble(-5.0, 5.0));


    }
}
