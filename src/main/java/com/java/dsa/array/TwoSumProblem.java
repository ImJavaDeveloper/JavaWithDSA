package com.java.dsa.array;

/*
Given an array A[] of n numbers and another number x, the task is
to check whether or not there exist two elements in A[] whose sum is exactly x.
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
}
