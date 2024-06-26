package com.dsa.custom.stack;

import java.util.Arrays;

public class CustomStack {
    
    private int[] data;
    private int count;
    
    public CustomStack(int capacity) {
        this.data = new int[capacity];
    }
    
    public CustomStack() {
        this.data = new int[5];//default capacity of stack
    }
    
    public void push(int val){
        doubleCapacity();
        data[count++] = val;
    }

    public int peek(){
        return data[count-1];
    }
    public int pop(){
        int ans = data[count-1];
        count--;
        return ans;
    }

    public int size() {
        return  count;
    }

    public boolean isEmpty(){
        return size()==0;
    }

    private void doubleCapacity() {
        if(count==data.length){
            int[] newArray = new int[2*data.length];
            for(int i=0;i<data.length;i++){
                newArray[i] = data[i];
            }
            data = newArray;
        }

    }

    public void print(){
        int[] printArray = Arrays.copyOfRange(data,0,count);
        System.out.println(Arrays.toString(printArray));
    }


    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.print();
        System.out.println(customStack.peek());
        System.out.println(customStack.pop());
        customStack.print();
        System.out.println(customStack.size());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.isEmpty());
        
    }

}
