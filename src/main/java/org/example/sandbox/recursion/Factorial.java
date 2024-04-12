package org.example.sandbox.recursion;

public class Factorial {

    private static long calculate(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculate(n -1);
    }

    public static void main(String[] args) {

        for(int x =0; x <=20; x++) {
        System.out.println(x+ ":" + Factorial.calculate(x));
        }
    }
}
