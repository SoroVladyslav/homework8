package org.example.homework9;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Object data;
        Node prev;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }

        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }

        size--;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }
}

//class Main {
//    public static void main(String[] args) {
//        MyLinkedList myLinkedList = new MyLinkedList();
//
//        myLinkedList.add(1);
//        myLinkedList.add(2);
//        myLinkedList.add(3);
//        System.out.println("ListSize: " + myLinkedList.size());
//
//        System.out.println("index 0: " + myLinkedList.get(0));
//        System.out.println("index 1: " + myLinkedList.get(1));
//        System.out.println("index 2: " + myLinkedList.get(2));
//
//        myLinkedList.remove(1);
//        System.out.println("before remove: " + myLinkedList.size());
//        System.out.println("after remove: " + myLinkedList.get(1));
//    }
//}