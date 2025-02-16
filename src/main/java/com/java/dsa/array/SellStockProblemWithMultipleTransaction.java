package com.java.dsa.array;

public class SellStockProblemWithMultipleTransaction {
    public static void main(String[] args) {
        int prices[]={2,1,5,6,3,12,9,1,2,4};

        int lmin=prices[0];
        int lmax=prices[0];
        int i=0;
        int n=prices.length;
        int totalProfit=0;
        while(i<n-1)
        {
            while(i<n-1 && prices[i]>=prices[i+1])
            {
                i++;
            }
            lmin=prices[i];
            while(i<n-1 && prices[i]<=prices[i+1])
            {
                i++;
            }
            lmax=prices[i];
            totalProfit=totalProfit+(lmax-lmin);
        }

        System.out.println("totalProfit:"+totalProfit);
    }
}
