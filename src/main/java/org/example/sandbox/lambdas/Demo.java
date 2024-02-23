package org.example.sandbox.lambdas;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

        // anonymous function
        // x -> x * 2

        // Predicate - takes 1 value and returns a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - takes 1 value and returns 1 value
        Function<Integer, Integer> function = x -> x *2;

        // Supplier - takes nothing and returns a value(s)
        Supplier<String> supplier = () -> "Hello Lambda!";

        // Consumer - takes a value and returns nothing
        Consumer<String> consumer = x -> System.out.println(x);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .sorted()
                .filter(x -> x.startsWith("c"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }




}
