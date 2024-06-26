package com.dsa.custom.stack;

import java.util.Arrays;

public class StackWithCustomLinkedList {

    private Node head;
    private Node tail;
    private int count;

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void push(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;

        }
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack Is Empty..");
        }
        return head.val;

    }

    public int size() {

        return count;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack Is Empty..");
        }
        int temp = head.val;
        Node newHead = head.next;
        head.next = null;
        head = newHead;
        count--;
        return temp;

    }

    @Override
    public String toString() {
        int[] data = new int[count];
        int index = 0;
        Node current = head;
        while (current != null) {
            data[index++] = current.val;
            current = current.next;
        }
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        StackWithCustomLinkedList s = new StackWithCustomLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.isEmpty());
    }
}
