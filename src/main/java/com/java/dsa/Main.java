package com.java.dsa;

import com.java.dsa.array.DuplicateElement;
import com.java.dsa.array.MissingNumber;
import com.java.dsa.array.SellStockProblem;
import com.java.dsa.array.TwoSumProblem;
import com.java.dsa.array.leetCode.GreatestCommonDivisorString;
import com.java.dsa.array.leetCode.MergeAlternately;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        main.checkTwoSumProblem();

        //
        main.sellStockProblem();

        //findDuplicateElement
        main.findDuplicateElement();

        //findMissingNumber
        main.findMissingNumber();

        //getMergeAlternately
        main.getMergeAlternately();

        main.testGreatestCommonDivisorString();

    }

    void checkTwoSumProblem()
    {
        TwoSumProblem twoSumProblem=new TwoSumProblem();
        int[] a ={1,8,5,6,9,6};
        int x=34;
        int y=10;
        System.out.println(twoSumProblem.isExistSumOfTwoNumberEqualToGiven(a,x));
        System.out.println(twoSumProblem.isExistSumOfTwoNumberEqualToGiven(a,y));
    }
    void sellStockProblem(){
        SellStockProblem sellStockProblem=new SellStockProblem();
        int prices[] = { 7, 1, 5, 6, 4 };
        int max_profit = sellStockProblem.getMaxProfile(prices);
        System.out.println(max_profit);
    }

    void findDuplicateElement(){
        DuplicateElement duplicateElement=new DuplicateElement();
        int array[]={1, 2, 3, 6, 3, 6, 1};
        System.out.println(duplicateElement.findDuplicate(array));
    }

    void findMissingNumber(){
        MissingNumber missingNumber=new MissingNumber();
        int array[]={3, 0, 1, 4};
        System.out.println(missingNumber.findMissingNumber(array));
    }

    void getMergeAlternately()
    {
        MergeAlternately mergeAlternately=new MergeAlternately();
        String s1="abc";
        String s2="xyz";
        System.out.println(mergeAlternately.mergeAlternately(s1,s2));
    }

    void testGreatestCommonDivisorString()
    {
        GreatestCommonDivisorString greatestCommonDivisorString=new GreatestCommonDivisorString();
        String s1="ABABAB";
        String s2="ABAB";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s1,s2));
        String s3="ABCABC";
        String s4="ABC";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s3,s4));
        String s5="ABC";
        String s6="LEET";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s5,s6));
        String s7="ABCEFG";
        String s8="ABC";
        System.out.println("GreatestCommonDivisorString:"+greatestCommonDivisorString.gcdOfStrings(s7,s8));

    }


}