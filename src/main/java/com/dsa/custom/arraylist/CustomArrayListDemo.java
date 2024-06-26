package com.dsa.custom.arraylist;

public class CustomArrayListDemo {

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList(2);
        customArrayList.add(1);
        customArrayList.add(3);
        customArrayList.add(4);
        System.out.println(customArrayList);
        customArrayList.add(1,2);
        customArrayList.add(0,5);
        System.out.println(customArrayList);
        System.out.println(customArrayList.get(2));
        customArrayList.delete(0);
        System.out.println(customArrayList);
        customArrayList.delete(3);
        System.out.println(customArrayList);
    }
}
