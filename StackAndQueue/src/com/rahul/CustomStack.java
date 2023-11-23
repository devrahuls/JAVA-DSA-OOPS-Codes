package com.rahul;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE); //which class that taking int as a constructor, the DEFAULT_SIZE will assign its value to that constructor.
    }

    //To push an item in the stack.
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full you dumbass");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public boolean isFull(){
        return ptr == data.length - 1; //means ptr is at its last index.
    }

    //To check whether the stack is empty or not.
    public boolean isEmpty(){
        return ptr == -1; //means stack is empty
    }

    //To pop an item
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Can't pop from an empty stack you dumb!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
        //OR return data[ptr--];
    }

    //To get a peek item
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Can't peek from an empty stack you dumb!");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(9);
        stack.push(79);
        stack.push(98);
        stack.push(96);
        stack.push(94);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);


    }
}
