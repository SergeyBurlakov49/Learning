package leetcode.No69Sqrt;

public class Sqrt {
    public static int mySqrt(int x) {
        for (int i = 1; i < x; i++) {
            if (x - i * i < 0) return i - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
