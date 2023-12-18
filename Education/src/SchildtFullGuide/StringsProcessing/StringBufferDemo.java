package SchildtFullGuide.StringsProcessing;
import static Utils.EmptyString.*;

/** Класс StringBuilder такой же, как StringBuffer, только быстрее и менее потокобезопасный.*/

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1.length() = " + sb1.length());
        System.out.println("sb1.capacity() = " + sb1.capacity());
        printEmptyString();

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("sb2.capacity() = " + sb2.capacity());
        printEmptyString();

        StringBuffer sb3 = new StringBuffer("aboba");
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        printEmptyString();

        sb3.ensureCapacity(30);
        System.out.println("sb3 minimum capcity after sb3.ensureCapacity(30) = " + sb3.capacity());
        printEmptyString();

        sb3.setLength(10);
        System.out.println("sb3.length after sb3.setLength(10) = " + sb3.length());
        printEmptyString();

        sb3.setCharAt(0, 'o');
        System.out.println("sb3.setCharAt(0, 'o') - " + sb3);
        printEmptyString();

        char [] chars = new char[5];
        sb3.getChars(1, 5, chars, 1);
        System.out.println("sb3.getChars:");
        for (char c:chars) System.out.println(c);
        printEmptyString();

        sb3.setLength(5);
        sb3.append("booba");
        System.out.println("sb3.append(\"booba\") : " + sb3);
        printEmptyString();

        sb3.insert(5, " uwu ");
        System.out.println("sb3.insert(5, \" uwu \") - " + sb3);
        printEmptyString();

        sb3.reverse();
        System.out.println("sb3.reverse() - " + sb3);
        printEmptyString();

        sb3.delete(6, 10);
        System.out.println("sb3.delete(6, 10) - " + sb3);
        printEmptyString();

        sb3.replace(0, 5, "amogus");
        System.out.println("sb3.replace(0, 5, \"amogus\") - " + sb3);
    }
}
