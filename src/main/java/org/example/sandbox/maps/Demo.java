package org.example.sandbox.maps;

import java.util.*;
public class Demo {
    public static void main(String[] args) {

        Map<Integer, String> numbers = new TreeMap<>();

        numbers.put(5, "Five");
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");

        for (int x = 1; x <= 5; x++) {
            System.out.println(numbers.get(x));
        }

        System.out.println(numbers);
    }
}
