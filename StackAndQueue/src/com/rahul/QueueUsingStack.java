package com.rahul;

import java.util.Queue;
import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peek = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        QueueUsingStack st = new QueueUsingStack();
        st.add(23);
        st.add(35);
        st.add(578);
        st.add(67);

        System.out.println(st.remove());
        System.out.println(st.peek());

    }

}
