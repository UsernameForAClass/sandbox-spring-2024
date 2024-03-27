package org.example.sandbox.linkedlist;

public class Driver {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new SinglyLinkedList<>();

        linkedList.addFirst("first");
        linkedList.addFirst("second");
        linkedList.addFirst("third");
        linkedList.addFirst("fourth");
        linkedList.addFirst("fifth");

        linkedList.addLast("sixth");
        linkedList.addLast("seventh");
        linkedList.addLast("eighth");

        System.out.println(linkedList);

        linkedList.pollFirst();

        System.out.println(linkedList);

        linkedList.pollFirst();
        linkedList.pollFirst();
        linkedList.pollFirst();
        linkedList.pollFirst();
        linkedList.pollFirst();
        linkedList.pollFirst();
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pollFirst());

        System.out.println(linkedList);
    }
}