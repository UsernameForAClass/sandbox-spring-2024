package org.example.sandbox.recursion;

public class GreatestCommonDivisor {

    public static int gcd1(int a, int b) {

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int gcd2(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int gcd3(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return gcd3(b, a % b);
        }

    }



    public static void main(String[] args) {
        System.out.println(GreatestCommonDivisor.gcd1(126, 54));
        System.out.println(GreatestCommonDivisor.gcd2(126, 54));
        System.out.println(GreatestCommonDivisor.gcd3(126, 54));
    }
}
