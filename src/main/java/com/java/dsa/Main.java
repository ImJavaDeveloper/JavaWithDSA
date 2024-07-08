package com.java.dsa;

import com.java.dsa.array.DuplicateElement;
import com.java.dsa.array.MissingNumber;
import com.java.dsa.array.SellStockProblem;
import com.java.dsa.array.TwoSumProblem;
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

}