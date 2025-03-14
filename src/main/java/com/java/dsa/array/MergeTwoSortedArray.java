package com.java.dsa.array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7};
        int[] ar2 = {2, 4, 6, 8};
        int[] result=new int[ar1.length+ar2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<ar1.length && j<ar2.length)
        {
            if(ar1[i]<ar2[j])
            {
                result[k++]=ar1[i++];
            }
            else
            {
                result[k++]=ar2[j++];
            }
        }
            while(i<ar1.length)
            {
                result[k++]=ar1[i++];

            }
            while(j<ar2.length)
            {
                result[k++]=ar2[j++];
            }


        for (int l=0;l<result.length;l++)
        {
            System.out.print(result[l]+" ");
        }
    }
}
