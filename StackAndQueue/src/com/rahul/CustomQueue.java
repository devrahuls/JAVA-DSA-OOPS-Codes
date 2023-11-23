package com.rahul;

public class CustomQueue {
    private int[] data;

    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }

    //To add an element in the Queue
    public boolean add(int item){
        if (isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    //To remove an item from the Queue.
    public int remove() throws Exception{
        if (isEmpty()){
            throw new  Exception("Queue is empty, can't remove anything.");
        }

        int remove = data[0];

        //To shift all the elements to the left side of 1.
        //AND, because of this, to remove an element from the Queue takes O(n) time complexity. (Can be reduced to O(1) by using Circular queue.)
        for (int i = 1; i < end ; i++) {
            data[i - 1] = data[i];
        }

        end--;
        return remove;
    }

    //To show the front item of the queue.
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty, can't give front value");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception{

        CustomQueue queue = new CustomQueue(5);
        queue.add(67);
        queue.add(53);
        queue.add(57);
        queue.add(34);
        queue.add(37);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.front());
        queue.display();
    }
}
