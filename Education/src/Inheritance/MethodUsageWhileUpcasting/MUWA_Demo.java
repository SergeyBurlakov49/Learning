package Inheritance.MethodUsageWhileUpcasting;

public class MUWA_Demo {
    public static void main(String[] args) {
        MUWA_A muwaA = new MUWA_A();
        MUWA_B muwaB = new MUWA_B();
        MUWA_A [] arr = new MUWA_A[2];
        arr[0] = muwaA;
        arr[1] = muwaB;
        for (MUWA_A muwa_a: arr){
            muwa_a.say();
        }
    }
}
