package com.rahul;

public class DLL {

    private Node head;
    private int size;
    public DLL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);

        node.next = head; //to address
        node.prev = null;
        if (head != null){
            head.prev = node; //from address
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);

        //if the linked list is empty
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }

        tail.next = node;
        node.prev = tail;
        node.next = null;
        tail = node;
    }


    public Node find(int val){
        Node node = head;
        while (node != null){
            if (node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAfterANumber(int after, int val){
        Node p = find(after);
        Node node = new Node(val);

        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        Node last = null; //for reverse printing
        while (node != null){
            System.out.print(node.val + " -> ");
            last = node; //from here we can get the last value of the linked list.
            node = node.next;
        }
        System.out.println("END");

//        System.out.println("Print in Reverse");//Print in Reverse
//        while (last != null){
//            System.out.print(last.val + " -> ");
//            last = last.prev;
//        }
//        System.out.println("START");
    }
    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
