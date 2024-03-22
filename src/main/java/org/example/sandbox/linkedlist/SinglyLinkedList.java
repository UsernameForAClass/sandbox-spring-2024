package org.example.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>{


    // what are out fields? They are Nodes
    private Node head;
    private Node tail;

    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void addFirst(E element) {

        Node node = new Node(element, head); // 1, 2


        // corner case for new list
        if (head == null) {
            tail = node;
        }
        head = node; // 3
    }

    @Override
    public void addLast(E element) {

        Node node = new Node(element, null); // 1, 2

        // can be reduced by 1 line
        if (tail == null) {
            tail = node;
            head = node;
        } else {
            tail.next = node; //3
            tail = node; //4
        }
    }

    @Override
    public E pollFirst() {

        E element;
        if (head == null) { // empty list
            element = null; // 1
        } else {

            element= head.element; // 1

            if (head == tail) { // one node
                head = null;
                tail = null;
            } else { // two or more nodes
                Node next = head.next; // 2
                head.next = null; // 3
                head = next; // 4
            }
        }


        return element;
    }

    @Override
    public E pollLast() {

        E element;
        if (tail == null) {
            element = null; // 1
        } else {

            element = tail.element;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node current = head; // 2
                Node previous = head; // 2
                while(current.next != null) {
                    previous = current;
                    current = current.next;
                }
                tail = previous; //3
                tail.next = null; //4
            }
        }

        return element;
    }

    @Override
    public E peekFirst() {
        return null;
    }

    @Override
    public E peekLast() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder ("[");
        StringJoiner joiner = new StringJoiner(", ");
        Node current = head;

        while (current != null) {
            joiner.add(current.element.toString());
            current = current.next;

        }

        builder.append(joiner);
        builder.append("]");
        return builder.toString();

    }

    private class Node {

        Node next;
        E element;

        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
    }
}
