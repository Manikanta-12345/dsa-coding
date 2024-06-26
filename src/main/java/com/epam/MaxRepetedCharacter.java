package com.epam;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxRepetedCharacter {
    public static void main(String[] args) {
        String str = "aaavvvvbbb";

        Long max = Arrays.stream(str.split("")).map(s->s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().mapToLong(entry->entry.getValue()).max().getAsLong();

//        long max = Long.MIN_VALUE;
//        for(Map.Entry<String,Long> countM:mapCount.entrySet()){
//            max  =Math.max(max,countM.getValue());
//        }

        if(max%2==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }




}
