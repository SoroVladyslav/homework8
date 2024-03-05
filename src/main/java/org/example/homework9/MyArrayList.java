package org.example.homework9;

public class MyArrayList {

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();

//        myArrayList.add("Hello");
//        myArrayList.add("World");

        for (int i = 0; i < myArrayList.getSize(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }

    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    public void add(Object input) {
        array[size++] = input;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index is out of bounds");
        }
        return array[index];
    }
}
