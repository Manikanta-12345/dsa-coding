package com.dsa.streams;

import java.util.Arrays;

public class MinAndMaxInArray {

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 22, 11, 33, 5 };
        int max = Arrays.stream(a).max().getAsInt();

        int min = Arrays.stream(a).min().getAsInt();

        System.out.println("min "+min +" max "+max);



    }
}
