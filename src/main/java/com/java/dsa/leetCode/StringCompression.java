package com.java.dsa.leetCode;

public class StringCompression {
    public static void main(String[] args) {
        char [] chars = {'a','a','a','b','b','c','c','c'};
        System.out.println("Compressed chars Length:"+new StringCompression().compress(chars));

    }

    public int compress(char[] chars) {
        if(chars.length==1)
            return 1;

        int right=1;
        int left=0;
        int newIndex=1;

        while(right<chars.length)
        {
            int count=1;
            while(right<chars.length && chars[left] == chars[right])
            {
                right++;
                count++;
            }
            if(count>1 && count<10)
            {
                chars[newIndex++]=Character.forDigit((right-left),10);
            }
            else if(count>10)
            {
                char[] digitChar=String.valueOf(right-left).toCharArray();
                for(char c:digitChar)
                    chars[newIndex++]=c;
            }
            else
            {
                chars[newIndex++]=chars[right];
                right++;
            }

            left=right-1;
        }
        return newIndex;
    }

}
