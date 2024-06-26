package com.dsa.custom.stack;

import java.util.LinkedList;

public class CustomStackWithLinkedList {

    private LinkedList data;

    CustomStackWithLinkedList() {
        data = new LinkedList();
    }

    public void push(int val){
        data.addLast(val);
    }
    public int peek(){
        return (int)data.getLast();
    }

    public int pop(){
        int ans = (int)data.getLast();
        data.removeLast();
        return  ans;
    }

    public int size()
    {
        return  data.size();
    }

    public void print(){
        System.out.println(data);
    }


    public static void main(String[] args) {
        CustomStackWithLinkedList customStackWithLinkedList = new CustomStackWithLinkedList();
        customStackWithLinkedList.push(1);
        customStackWithLinkedList.push(2);
        customStackWithLinkedList.push(3);
        customStackWithLinkedList.print();
        System.out.println(customStackWithLinkedList.peek());
        customStackWithLinkedList.pop();
        customStackWithLinkedList.print();
        System.out.println(customStackWithLinkedList.size());

//        Stack s  = new Stack();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        System.out.println(s);
//        System.out.println(s.peek());


    }
}
