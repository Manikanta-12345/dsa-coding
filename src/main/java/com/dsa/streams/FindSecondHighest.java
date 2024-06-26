package com.dsa.streams;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighest {

    public static void main(String[] args) {
        int a[] = { 2, 3, 1, 22, 11, 33, 5 };
        int secondHighest = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get();
        System.out.println(secondHighest);
    }
}
