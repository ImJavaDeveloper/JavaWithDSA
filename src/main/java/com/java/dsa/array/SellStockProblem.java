package com.java.dsa.array;


/*Given an array prices[] of length N, representing the prices of the stocks on different days, the
task is to find the maximum profit possible by buying and selling the stocks on different days when
at most one transaction is allowed.*/
public class SellStockProblem {

        public int getMaxProfile(int []prices)
        {
            int len=prices.length;
            int buy=prices[0];
            int max_profit=0;
            for(int i=1;i<len;i++)
            {
                //checkin
                if(buy>prices[i])
                {
                    buy=prices[i];
                }
                else if (prices[i]-buy>max_profit) {
                    max_profit=prices[i]-buy;
                }
            }

            return max_profit;
        }
}
