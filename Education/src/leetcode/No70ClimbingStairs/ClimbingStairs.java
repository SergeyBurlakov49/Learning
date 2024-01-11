package leetcode.No70ClimbingStairs;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int [] fib = new int[46];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        for (int i = 0; i < 46; i++) {
            System.out.println(i + ": " + climbStairs(i));
        }
    }
}
