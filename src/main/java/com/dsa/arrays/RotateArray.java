package com.dsa.arrays;

import com.dsa.sorting.SortingUtils;

import java.util.Arrays;

public class RotateArray {


    public  static void rotateLeft(int[] input,int x){
        int len = input.length;
        int end = input.length-1;
        rotate(input,0,end);
        rotate(input,0,len-x-1);
        rotate(input,len-x,end);
    }

    public  static void rotateRight(int[] input,int x){
        int len = input.length;
        int end = input.length-1;
        rotate(input,0,end);
        rotate(input,0,x-1);
        rotate(input,x,end);
    }

    public static  void rotate(int[] input,int left,int right){
        while(left<right){
            SortingUtils.swap(input,left,right);
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        //rotateLeft(array1,2);
        rotateRight(array1,2);
        System.out.println(Arrays.toString(array1));
    }
}
