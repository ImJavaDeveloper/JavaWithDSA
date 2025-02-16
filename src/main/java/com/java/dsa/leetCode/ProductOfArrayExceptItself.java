package com.java.dsa.leetCode;

public class ProductOfArrayExceptItself {

    public static void main(String[] args) {
        //Using Prefix and suffix time complexity-O(n) and space O(n)
        int[] num ={1,2,5,7};
        int n=num.length;

        int[] prefix =new int[n];
        int[] suffix =new int[n];
        int[] result =new int[n];
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++)
        {
         prefix[i]=prefix[i-1]*num[i-1];
        }
        for(int j=n-2;j>=0;j--)
        {
            suffix[j]=suffix[j+1]*num[j+1];
        }
        for(int k=0;k<n;k++)
        {
            result[k]=prefix[k]*suffix[k];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }

        //Reducing space complexity to O(1)
        int res[]=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]*num[i-1];
        }
        int suffix2=1;
        //res[n-1]=res[n-1]*suffix2;
        for(int j=n-2;j>=0;j--)
        {
            suffix2=suffix2*num[j+1];
            res[j]=res[j]*suffix2;
        }
        System.out.println("\nReducing space complexity to O(1)");
        for (int i=0;i<n;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
