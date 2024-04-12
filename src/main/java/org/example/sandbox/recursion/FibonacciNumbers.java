package org.example.sandbox.recursion;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    private Map<Integer, Long> dictionary;

    public FibonacciNumbers() {
        this.dictionary = new HashMap<>();
    }

    public long fib(int n) {

        if(n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return memo(n-1) + memo(n - 2);
    }

    private long memo(int m) {

        Long value = dictionary.get(m);

        if (value != null) {
            return value;
        }

        value = fib(m);
        dictionary.put(Integer.valueOf(m), value);
        return value;
    }

    public static void main(String[] args) {

        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        for(int x = 0; x <=50; x++) {
            System.out.println(x + ":" +fibonacciNumbers.fib(x));
        }

    }

}