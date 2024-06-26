package com.dsa.custom.linkedlist;

public class CustomLinkedListDemo {
    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.addFirst(2);
        customLinkedList.addFirst(1);
        customLinkedList.addLast(3);
        customLinkedList.addLast(4);
        //customLinkedList.addFirst(5);
        //System.out.println(customLinkedList);
        //customLinkedList.print(customLinkedList.getHead());
        customLinkedList.deleteFirst();
        //customLinkedList.print(customLinkedList.getHead());
        customLinkedList.deleteLast();
        customLinkedList.print(customLinkedList.getHead());
    }
}
