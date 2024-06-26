package com.dsa.custom.queue;

import java.util.Arrays;

public class QueueWithLinkedList {

    private Node front;
    private Node rear;
    private int count;

    public class Node {
        Node next;
        int val;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public void enqueue(int val) {
        Node node = new Node(val);
        if(front == null){
            front = rear = node;
            front.next = null;
        }else {
            rear.next = node;
            rear = node;
        }
       // head.next = null;
        count++;
    }

    public int poll() {
        if(isEmpty()){
            throw new IllegalArgumentException("Queue Is Empty");
        }
        int oldVal = front.val;
        Node newHead = front.next;
        front.next = null;
        front = newHead;
        count--;
        return oldVal;
    }

    public boolean isEmpty(){
        return count==0;
    }

    public int peek(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
       return front.val;
    }

    public int size() {
        return count;
    }

    @Override
    public String toString() {
        int [] data = new int[count];
        int index = 0;
        Node current = front;
        while(current!=null){
            data[index] = current.val;
            index++;
            current = current.next;
        }
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        QueueWithLinkedList queueWithLinkedList = new QueueWithLinkedList();
        queueWithLinkedList.enqueue(10);
        queueWithLinkedList.enqueue(20);
        queueWithLinkedList.enqueue(30);
        queueWithLinkedList.enqueue(40);
        System.out.println(queueWithLinkedList);
        System.out.println(queueWithLinkedList.peek());
        System.out.println(queueWithLinkedList.poll());
        System.out.println(queueWithLinkedList);
        System.out.println(queueWithLinkedList.poll());
        System.out.println(queueWithLinkedList);
        queueWithLinkedList.enqueue(50);
        System.out.println(queueWithLinkedList);
        System.out.println(queueWithLinkedList.isEmpty());
        System.out.println(queueWithLinkedList.size());

    }
}
