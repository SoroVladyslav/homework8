package org.example.homework9;

public class MyHashMap {

    private static final int DEFAULT_CAPACITY = 16;
    private Node[] buckets;
    private int size;

    private static class Node {
        Object key;
        Object value;
        Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(Object key, Object value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
            size++;
            return;
        }

        Node current = buckets[index];
        while (current.next != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        if (current.key.equals(key)) {
            current.value = value;
        } else {
            current.next = newNode;
            size++;
        }
    }

    public Object get(Object key) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null;
    }

    public void remove(Object key) {
        int index = hash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public void clear() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }
}

//class MainHashMap {
//    public static void main(String[] args) {
//        MyHashMap map = new MyHashMap();
//
//        map.put("key1", "value1");
//        map.put("key2", "value2");
//        map.put("key3", "value3");
//
//        System.out.println("value 1 \"key1\": " + map.get("key1"));
//        System.out.println("value 2 \"key2\": " + map.get("key2"));
//        System.out.println("value 3 \"key3\": " + map.get("key3"));
//
//        map.remove("key2");
//        System.out.println("after remove: " + map.size());
//    }
//}