package com.dsa.sorting;

public class SortingUtils {

    public static void swap(int[] input,int index1,int index2){
        int temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }

    public static void swap(char[] input,int index1,int index2){
        char temp = input[index1];
        input[index1] = input[index2];
        input[index2] = temp;
    }

    public static String swap(String a, int i, int j) {
        char[] charArray = a.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
