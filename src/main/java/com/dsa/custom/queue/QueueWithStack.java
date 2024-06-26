package com.dsa.custom.queue;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithStack {

    private Stack<Integer> enqueueStack = new Stack<>();
    private Stack<Integer> dequeueStack =new Stack<>();

    private int count;



    public void enqueue(int val){
        enqueueStack.push(val);
        count++;
    }

    public boolean isEmpty(){
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
    public int peek() {
        if(dequeueStack.isEmpty()){
            if(!enqueueStack.isEmpty()){
                while(!enqueueStack.isEmpty()){
                    dequeueStack.push(enqueueStack.pop());
                }
            }
        }
        return dequeueStack.peek();
    }

    public int poll() {
        if(dequeueStack.isEmpty()){
            if(!enqueueStack.isEmpty()){
                while(!enqueueStack.isEmpty()){
                    dequeueStack.push(enqueueStack.pop());
                }
            }
        }
        count--;
        return dequeueStack.pop();
    }

    public int size() {
        return count;
    }



    public static void main(String[] args) {
        QueueWithStack queueWithStack = new QueueWithStack();
        queueWithStack.enqueue(10);
        queueWithStack.enqueue(20);
        queueWithStack.enqueue(30);
        queueWithStack.enqueue(40);
        queueWithStack.enqueue(50);
        System.out.println(queueWithStack.peek());
        System.out.println(queueWithStack.poll());
        System.out.println(queueWithStack.peek());
        System.out.println(queueWithStack.isEmpty());
        System.out.println(queueWithStack.size());

    }
}
