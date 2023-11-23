package com.rahul;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(69);
//        stack.push(5);
//        stack.push(57);
//        stack.push(76);
//        stack.push(67);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>(); //because Queue implements the LinkedList, whereas Stack is a class itself.

        queue.add(9);
        queue.add(21);
        queue.add(32);
        queue.add(53);
        queue.add(54);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);

       Deque<Integer> deque = new ArrayDeque<>();
       deque.add(78);
       deque.addLast(32);
       deque.addFirst(43);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
        System.out.println(deque);




    }
}