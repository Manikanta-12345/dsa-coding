package com.dsa.strings;

import com.dsa.sorting.SortingUtils;

public class StringLeftAndRightShift {


    public  static void rotateLeft(char[] input,int x){
        int len = input.length;
        int end = input.length-1;
        rotate(input,0,end);
        rotate(input,0,len-x-1);
        rotate(input,len-x,end);
    }

    public  static void rotateRight(char[] input,int x){
        int len = input.length;
        int end = input.length-1;
        rotate(input,0,end);
        rotate(input,0,x-1);
        rotate(input,x,end);
    }

    public static  void rotate(char[] input,int left,int right){
        while(left<right){
            SortingUtils.swap(input,left,right);
            left++;
            right--;
        }
    }


    public static void main(String[] args) {
        String s  = "abcdefg";
        char[] input = s.toCharArray();
        rotateRight(input,2);
        String leftShift = new String(input);
        rotateRight(leftShift.toCharArray(),4);
        String finalAns = new String(leftShift);
        System.out.println(leftShift);

    }
}
