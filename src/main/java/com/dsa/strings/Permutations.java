package com.dsa.strings;

import com.dsa.sorting.SortingUtils;

public class Permutations {


    public static void main(String[] args) {

        String s = "abc";
        genPerm(s,0,s.length()-1);


    }

    public static void genPerm(String s,int left,int right){

        if(left==right){
            System.out.println(s);
        }else {
            for(int i=left;i<=right;i++){
                s = SortingUtils.swap(s,left,i);
                genPerm(s,left+1,right);
                s = SortingUtils.swap(s,left,i);
            }
        }


    }
}
