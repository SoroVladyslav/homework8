package org.example.homework9;

public class MyQueue {

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public MyQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Object value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Object peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public Object poll() {
        if (head == null) {
            return null;
        }
        Object value = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;
    }
}
class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);

        System.out.println("queue size: " + myQueue.size());
        System.out.println("first element: " + myQueue.peek());
        System.out.println("removed from queue: " + myQueue.poll());
        System.out.println("size after remove: " + myQueue.size());
    }
}
