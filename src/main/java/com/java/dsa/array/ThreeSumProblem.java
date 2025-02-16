package com.java.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int [] nums={-1,0,1,2,-1,-4};
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0)
                    {
                        System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                    }
                }
            }
        }
        // Using Two pointer approach
        //nums[i]+nums[j]+nums[k]=0;
        //nums[j]+nums[k]=0-nums[i]; //expected
        System.out.println("With Two Pointer Technique:");
        Arrays.sort(nums);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            System.out.println("Processing ith Element:"+nums[i]);
            //Skipping Duplicate
            if(i>0 && nums[i]==nums[i-1]){
                System.out.println("Skipping Duplicate:");
                continue;
            }

            int left=i+1;
            int right=n-1;
            int target= -nums[i];
            //applying Two Pointer Technique

            while(left<right)
            {

             if(left<right && nums[left]+nums[right]==target)
             {

                result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                //Skipping Duplicate
                 while(left<right && nums[left]==nums[left+1])
                    {
                        left++;
                    }
                 //Skipping Duplicate
                 while(left<right && nums[right]==nums[right-1])
                 {
                     right--;
                 }
                 left++;
                 right--;
             }
             else if(left<right  && nums[left]+nums[right]<target)
             {
                 left++;
             }
             else
                 right--;
            }

        }
        System.out.println("Result:");
        System.out.println(result);
    }

}
