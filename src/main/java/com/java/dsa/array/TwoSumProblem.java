package com.java.dsa.array;

import java.util.Arrays;

/*
Given an array A[] of n numbers and another number x, the task is
to check whether there exist two elements in A[] whose sum is exactly x.
*/
public class TwoSumProblem {

    public boolean isExistSumOfTwoNumberEqualToGiven(int [] arr,int x)
    {
        boolean result=false;
        for(int i=0;i<arr.length-2;i++) {
          for(int j=i+1;j<arr.length;j++)
          {
              if (arr[i] + arr[j] == x) {
                  result = true;
                  break;
              }
          }
        }
        return result;
    }
    // Solving with the help of two pointer
    public static void main(String[] args) {
        int num[]={2,1,5,6,3,12,9,4};
        int target=9;
        Arrays.sort(num);
        //num[]={1,2,3,4,5,6,9,12};

        int left=0;
        int right=num.length-1;
        while(left<right)
        {
            if(num[left]+num[right]== target){
                System.out.println("Numbers Found:"+num[left]+","+num[right]);
                break;
            }
            if(num[left]+num[right]< target)
            {
                left++;
            }
            if(num[left]+num[right]> target)
            {
                right--;
            }
        }
    }
}
