package com.java.dsa.slidingwindow;

import java.util.HashSet;
import java.util.Set;

/*
find the maximum no repeating characters in a sub string
 */
public class DynamicSlidingWindowExample {
    public static void main(String[] args) {
        String s="abcabcbb";
        int len=s.length();
        int left=0;
        int right=0;
        int max=0;
        Set<Character> result=new HashSet<>();

        for(int i=0;i<len;i++)
        {
            if(result.contains(s.charAt(i)))
            {
                while(s.charAt(left)!=s.charAt(i))
                {
                    result.remove(s.charAt(left));
                    left++;
                }

                left++;
                result.remove(s.charAt(i));
            }
            else {
                result.add(s.charAt(i));
                right++;
                max=Math.max(max,right-left);
            }
        }
        System.out.println("Max:"+max);

    }
}
