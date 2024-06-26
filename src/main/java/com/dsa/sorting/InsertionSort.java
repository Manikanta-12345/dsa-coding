package com.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] input){
        for(int i=1;i<input.length;i++){
            int j = i-1;
            int key = input[i];
            while(j>=0 && input[j]>key){
                input[j+1] = input[j];
                j--;
            }
            //replace the last element
            input[j+1] = key;
        }
    }


    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 6, 3, 1, 5, 7};
        insertionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
