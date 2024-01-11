package leetcode.No263UglyNumber;

/** я не понимаю, что такое Ugly Number... */

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        for (int i = 7; i < n; i++){
            if (n % i == 0 && isPrime(i)) return false;
        }
        return true;
    }

    public static boolean isPrime(int x){
        for (int i = x - 1; i > 1; i--){
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isUgly(1);
    }
}
