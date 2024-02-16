package org.example.sandbox.generics;

public class Factory {

    public static <T> T getInstance(Class<T> clazz) throws Exception {
        return clazz.getConstructor().newInstance();
    }

    public static void main(String[] args) {

        try {
            Box<Integer> box = Factory.getInstance(Box.class);
            String message = Factory.getInstance(String.class);
            box.setContents(1);
            message = "Hello";
            System.out.println(message);
            System.out.println(box);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
