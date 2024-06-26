package com.dsa.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstNonRepatedCharacter {

    public static void main(String[] args) {
        String input = "Java Articles are Awesome";


       String repeating = Arrays.stream(input.split("")).map(s->s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).map(entry->entry.getKey()).findFirst().get();
        System.out.println(repeating);

        String nonRepeating = Arrays.stream(input.split("")).map(s->s.toLowerCase())
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
        System.out.println(nonRepeating);
    }
}
