package com.java.dsa.slidingwindow;

/*
Question to solve with fixed sliding window: Given an array of integers of size ‘n’.
Our aim is to calculate the maximum sum of ‘k’ consecutive elements in the array.
 */
public class FixedSlidingWindowExample {

    public static void main(String[] args) {
        int nums[]={2,1,5,6,3,12,9,4};
        int k=3;
        int n=nums.length;
        int maxSum=0;

        for(int i=0;i<k; i++)
        {
            maxSum=maxSum+nums[i];
        }
        int windowSum=maxSum;
        for(int j=k;j<n;j++)
        {
            windowSum=windowSum+nums[j];
            windowSum=windowSum-nums[j-k];
            maxSum=Math.max(maxSum,windowSum);

        }
        System.out.println("Max Sum:"+maxSum);
    }
}
