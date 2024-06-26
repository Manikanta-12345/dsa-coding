package com.dsa.custom.arraylist;

import java.util.Arrays;

public class CustomArrayList {

    private int count;

    private int[] data;

    public CustomArrayList(int capacity){
        this.data = new int[capacity];
    }

    public CustomArrayList() {
        this.data = new int[10];
    }

    public void add(int item){
        //check array already filled?
        growArray();
        data[count++] = item;
    }

    public void add(int index,int item){
        if(index<0){
            throw new IllegalArgumentException("Index should be positive");
        }
        growArray();
        for(int i=count;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = item;
        count++;
    }

    public void growArray(){
        if(count == data.length) {
            int [] tempArray = new int[data.length*5];
            for(int i=0;i<count;i++){
                tempArray[i] = data[i];
            }
            data = tempArray;
        }
    }

    public int size() {
        return count;
    }


    public int indexOf(int item){
        int index = -1;
        for(int i=0;i<count;i++){
            if(data[i]==item){
                index = i;
            }
        }

        return index;
    }

    public void delete(int index){
        for(int i=index;i<count;i++){
            data[i] = data[i+1];
        }
        count--;
    }

    public int get(int index) {
      return data[index]>0?data[index]:-1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data,count));
    }
}
