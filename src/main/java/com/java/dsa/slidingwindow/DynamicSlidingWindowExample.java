package com.java.dsa.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/*
find the maximum no repeating characters in a string
 */
public class DynamicSlidingWindowExample {
    public static void main(String[] args) {
        String s="abcabcbbc";
        int len=s.length();
        int left=0;
        int right=0;

        Set<Character> result=new HashSet<>();
        for(int i=0;i<len;i++)
        {
            if(result.contains(s.charAt(i)))
            {
                result.remove(s.charAt(left));
                left++;
            }
            else {
                result.add(s.charAt(i));
                right++;
            }
        }
        System.out.println("Result:"+result);

    }
}
