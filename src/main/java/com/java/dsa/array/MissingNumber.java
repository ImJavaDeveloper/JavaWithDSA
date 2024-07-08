package com.java.dsa.array;

public class MissingNumber {

    public int findMissingNumber(int [] nums){
        int arrayLen=nums.length;
        int sum=0;
        for(int i=0;i<arrayLen;i++)
        {
            sum=sum+nums[i];
        }
        int requiredSum=(arrayLen*(arrayLen+1))/2;
        return requiredSum-sum;
    }
}
