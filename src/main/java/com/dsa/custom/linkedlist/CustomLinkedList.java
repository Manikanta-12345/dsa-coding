package com.dsa.custom.linkedlist;

public class CustomLinkedList {

    private class Node {
        private int val;
        private  Node next;

        public Node(int val){
            this.val = val;
            this.next = null;
        }

        @Override
        public String toString() {
            return val+"";
        }
    }

    public Node getHead() {
        return head;
    }

    private Node head;
    private Node last;


    public void addFirst(int val) {
        Node currentNode = new Node(val);
        if(head==null && last == null){
              head = last = currentNode;
              last.next = null;
              return;
        }
        currentNode.next = head;
        head = currentNode;
    }

    public void addLast(int val) {
        Node currentNode = new Node(val);
        if(head==null && last == null){
            head = last = currentNode;
            last.next = null;
            return;
        }
        last.next = currentNode;
        last = currentNode;
    }

    public void deleteFirst() {
        if(head!=null) {
            Node nextHead = head.next;
            head.next = null;
            head = nextHead;
        }
    }

    public void deleteLast() {
        if(head!=null) {
           Node previous = getPreviousNode(last);
           previous.next = null;
           last = previous;

        }
    }

    public Node getPreviousNode(Node target) {
        if (head == null || head == target) {
            return null; // No previous node if the list is empty or target is the head
        }

        Node current = head;
        while (current.next != null && current.next != target) {
            current = current.next;
        }

        return (current.next == target) ? current : null;
    }

    public void print(Node head) {
        while(head!=null) {
            System.out.print(head.val+ " ");
            head = head.next;
        }
    }
}
