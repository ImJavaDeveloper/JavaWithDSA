package com.java.dsa.leetCode;

public class ReverseInteger {

    public static void main(String[] args) {
        int x=546464765;
        int result=0;
        boolean isNegative=false;
        int prev=0;
        if(x<0)
        {
            x=Math.abs(x);
            isNegative=true;
        }

        while(x>0)
        {
            int rem=x%10;
            result=result*10+rem;
            if((result-rem)/10 != prev)
                System.out.println("Overflow Occurred");;
            prev=result;
            x=x/10;
        }
        if(!isNegative) {
            System.out.println(result);
        }
         else
         System.out.println(-result);;
    }
}
