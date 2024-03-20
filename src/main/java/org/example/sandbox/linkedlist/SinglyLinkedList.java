package org.example.sandbox.linkedlist;

import java.util.StringJoiner;

public class SinglyLinkedList<E> implements LinkedList<E>{


    // what are out fields? They are Nodes
    private Node head;
    private Node tail;



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

    }

    @Override
    public E pollFirst() {
        return null;
    }

    @Override
    public E pollLast() {
        return null;
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
