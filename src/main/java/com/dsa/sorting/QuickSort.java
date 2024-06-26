package com.dsa.sorting;

import java.util.Arrays;

import static com.dsa.sorting.SortingUtils.swap;

public class QuickSort {


    public static void quickSort(int[] input,int start,int end) {
        if(start>=end){
            return;
        }
        int boundary = getPivot(input,start,end);
        quickSort(input,start,boundary-1);
        quickSort(input,boundary+1,end);

    }

    public static  int getPivot(int[] input,int start,int end){
        int pivot = input[end];
        int boundary = start-1;
        for(int i=start;i<=end;i++){
            if(input[i]<=pivot){
                boundary++;
                swap(input,i,boundary);
            }
        }
        return boundary;
    }




    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 6, 3, 1, 5, 7};
        quickSort(input,0,input.length-1);
        System.out.println(Arrays.toString(input));
    }
}
