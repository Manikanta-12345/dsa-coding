package com.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] input) {
        boolean swapped;
        for (int i = 0; i < input.length; i++) {
            swapped = false;
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    SortingUtils.swap(input, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }


    public static void main(String[] args) {
        int[] input = new int[]{4, 2, 6, 3, 1, 5, 7};
        bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }
}
