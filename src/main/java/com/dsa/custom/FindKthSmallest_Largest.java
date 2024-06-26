package com.dsa.custom;

import java.util.PriorityQueue;

public class FindKthSmallest_Largest {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6};
        System.out.println(findKthSmallest(input,3));
        System.out.println(findKthLargest(input,2));

    }

    public static int findKthSmallest(int[] input,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k,(a,b) -> b-a);
        for(int num:input){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println("small queue "+pq);
        return pq.peek();

    }

    public static int findKthLargest(int[] input,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k);
        for(int num:input){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println("large queue "+pq);
        return pq.peek();

    }
}
