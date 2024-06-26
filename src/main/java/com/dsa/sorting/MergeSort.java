package com.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] input) {
        if(input.length<2){
            return;
        }
        int[] left = new int[input.length / 2];
        for (int i = 0; i < input.length / 2; i++) {
            left[i] = input[i];
        }

        int[] right = new int[input.length - left.length];

        for (int i = input.length / 2; i < input.length; i++) {
            right[i - input.length / 2] = input[i];
        }

        mergeSort(left);
        mergeSort(right);

       mergeTwoArrays(left,right,input);

    }

    public static void mergeTwoArrays(int[] a1, int[] a2,int[] input) {

        int m = 0;
        int n = 0;
        int k = 0;

        while (m < a1.length && n < a2.length) {
            if (a1[m] <= a2[n]) {
                input[k] = a1[m];
                m++;
                k++;
            }
            else{
                input[k] = a2[n];
                n++;
                k++;
            }

        }

        while(m<a1.length){
            input[k] = a1[m];
            m++;
            k++;
        }

        while(n<a2.length){
            input[k] = a2[n];
            n++;
            k++;
        }

    }

    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 6, 3, 1, 5, 7};
        mergeSort(input);
        System.out.println(Arrays.toString(input));
    }
}
