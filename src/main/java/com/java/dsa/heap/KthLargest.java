package com.java.dsa.heap;

import java.util.PriorityQueue;

public class KthLargest {

    public static void main(String[] args) {

        int [] nums={3,4,1,2,6,10,11,5,7,8,9};
        int k=3;

        //using bubble sort

        for(int i=0;i<k;i++)
        {
            for(int j=0; j<nums.length-i-1 ; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        System.out.println(nums[nums.length-k]);

        //Using Priority Queue
        int [] nums1={3,4,1,2,6,10,11,5,7,8,9};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums1.length;i++)
        {
           pq.add(nums1[i]);
            if(pq.size()>k)
            {
                pq.remove();
            }

        }
        System.out.println(k+"th largest element:"+pq.peek());
    }
}
