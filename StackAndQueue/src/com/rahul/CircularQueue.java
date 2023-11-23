package com.rahul;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    protected int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    //To add an element in the Queue
    public boolean add(int item){
        if (isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    //To remove an item from the Queue.
    public int remove() throws Exception{
        if (isEmpty()){
            throw new  Exception("Queue is empty, can't remove anything.");
        }

        int remove = data[front];
        front++;
        front = front % data.length;
        size--;
        return remove;
    }

    //To show the front item of the queue.
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty, can't give front value");
        }
        return data[front];
    }

    public void display(){
       if (isEmpty()){
           System.out.println("Empty");
           return;
       }

       int i = front;
       do {
           System.out.print(data[i] + " -> ");
           i++;
           i %= data.length;
       }while (i != end);
    }

    public static void main(String[] args) throws Exception{

        CircularQueue cq = new CircularQueue(5);

        cq.add(10);
        cq.add(537);
        cq.add(567);
        cq.add(50);
        cq.add(74);

        System.out.println(cq.remove());
        System.out.println(cq.remove());
        System.out.println(cq.front);
        cq.display();


    }
}
