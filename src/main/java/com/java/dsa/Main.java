package com.java.dsa;

import com.java.dsa.array.TwoSumProblem;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        main.checkTwoSumProblem();

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
}