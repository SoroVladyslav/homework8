package org.example.homework9;

public class MyStack {

    private Node top;
    private int size;

    private static class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }
    }

    public MyStack() {
        top = null;
        size = 0;
    }

    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        Object value = top.data;
        top = top.next;
        size--;
        return value;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    public void clear() {
        top = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

//class MainStack {
//    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//
//        myStack.push(1);
//        myStack.push(2);
//        myStack.push(3);
//
//        System.out.println("stack size: " + myStack.size());
//        System.out.println("upper element: " + myStack.peek());
//        System.out.println("removed from stack: " + myStack.pop());
//        System.out.println("after remove: " + myStack.size());
//    }
//}