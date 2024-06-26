package com.dsa.sorting;

import java.util.Arrays;

import static com.dsa.sorting.SortingUtils.swap;

public class SelectionSort {

    public static void selectionSort(int[] input) {
        for(int i=0;i<input.length;i++){
            int minIndex = i;
            for(int j=i+1;j<input.length;j++){
                if(input[minIndex]>input[j]){
                    minIndex = j;
                }
            }
            swap(input,i,minIndex);
        }
    }


    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 6, 3, 1, 5, 7};
        selectionSort(input);
        System.out.println(Arrays.toString(input));
    }
}
