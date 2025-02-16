package com.java.dsa.array;


/*
Given an array prices[] of length N, representing the prices of the stocks on different days, the
task is to find the maximum profit possible by buying and selling the stocks on different days when
at most one transaction is allowed.
int prices[] = { 7, 1, 5, 6, 4 };
Expected Profit: 5
*/
public class SellStockProblem {

        public int getMaxProfile(int []prices)
        {
            int len=prices.length;
            int buy=prices[0];
            int max_profit=0;
            for(int i=1;i<len;i++)
            {
                //checking if the current price is less than the buy price
                if(buy>prices[i])
                {
                    buy=prices[i];
                }
                //checking if the current price - buy price is greater than the max profit
                else if (prices[i]-buy>max_profit) {
                    max_profit=prices[i]-buy;
                }
            }

            return max_profit;
        }
}
