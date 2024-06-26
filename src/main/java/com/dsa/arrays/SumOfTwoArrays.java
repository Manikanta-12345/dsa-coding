package com.dsa.arrays;

import java.util.Arrays;

public class SumOfTwoArrays {

    public  static int[] sumOfTwoArrays(int[] a1,int[] a2){
        int m = a1.length-1;
        int n = a2.length-1;
        int k = Math.max(a1.length,a2.length)+1;
        int[] output = new int[k];
        int carry = 0;

        while(m>=0 && n>=0){

           int sum = a1[m]+a2[n]+carry;
            output[k-1] = sum%10;
            carry = sum/10;
            m--;
            n--;
            k--;

        }

        while(m>=0){
            int sum =a1[m]+carry;
            output[k] = sum%10;
            carry = sum/10;
            m--;
            k--;

        }

        while(n>=0){
            int sum =a2[n]+carry;
            output[k] = sum%10;
            carry = sum/10;
            n--;
            k--;

        }

        output[0] = carry;
        // If there is no carry, shift the result array to exclude the leading zero
        if (output[0] == 0) {
            return Arrays.copyOfRange(output, 1, output.length);
        }

        return output;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] out = sumOfTwoArrays(array1,array2);
        System.out.println(Arrays.toString(out));
    }
}
