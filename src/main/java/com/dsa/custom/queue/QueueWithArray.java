package com.dsa.custom.queue;

import java.util.Arrays;

public class QueueWithArray {

    private int[] data;
    private int rear;
    private int front;
    private int count;

    public QueueWithArray() {
        data = new int[5];
    }

    //enqueue
    public void enqueue(int val){
        if(count == data.length){
            throw new IllegalArgumentException();
        }
        data[rear] = val;
        rear = (rear+1)%data.length;
        count++;

    }

    //enqueue
    public int poll(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
        int item = data[front];
        data[front] = 0;
        front = (front+1)%data.length;
        count--;
        return item;

    }

    public boolean isEmpty(){
        return count==0;
    }

    public int size(){
        return count;
    }

    //enqueue
    public int peek(){
        if(isEmpty()){
            throw new IllegalArgumentException("Queue is Empty");
        }
        int item = data[front];
        return item;

    }


    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        QueueWithArray queueWithArray = new QueueWithArray();
        queueWithArray.enqueue(10);
        queueWithArray.enqueue(20);
        queueWithArray.enqueue(30);
        queueWithArray.enqueue(40);
        queueWithArray.enqueue(50);
        System.out.println(queueWithArray);
        System.out.println(queueWithArray.peek());
        System.out.println(queueWithArray.poll());
        queueWithArray.enqueue(60);
        System.out.println(queueWithArray);
        System.out.println(queueWithArray.isEmpty());
        System.out.println(queueWithArray.size());
    }
}
