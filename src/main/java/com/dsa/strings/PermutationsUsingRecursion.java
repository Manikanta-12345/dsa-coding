package com.dsa.strings;

public class PermutationsUsingRecursion {


    public static void main(String[] args) {
        String s = "abcd";
        genPerm(s,"");

    }

    public static void genPerm(String s ,String combinations){
        if(s.isEmpty()){
            System.out.println(combinations);
            return;
        }

        for(int i=0;i<s.length();i++){
            String remaining = s.substring(0,i)+s.substring(i+1);
            genPerm(remaining,combinations+s.charAt(i));
        }

    }
}
