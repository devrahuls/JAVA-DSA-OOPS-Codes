package com.rahul;

public class Main {
    public static void main(String[] args) {

        LL linkedList = new LL();
        linkedList.insertFirst(7);
        linkedList.insertFirst(42);
        linkedList.insertFirst(53);
        linkedList.insertFirst(3);

        linkedList.display();

        linkedList.insertLast(23);
        linkedList.display();

        linkedList.insert(69, 3);
        linkedList.display();

    }
}