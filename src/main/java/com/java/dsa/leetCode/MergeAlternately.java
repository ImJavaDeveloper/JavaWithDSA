package com.java.dsa.leetCode;

/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating
order, starting with word1. If a string is longer than the other, append the additional letters
onto the end of the merged string.

Return the merged string.*/
public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        char [] word1chars=word1.toCharArray();
        char [] word2chars=word2.toCharArray();
        int lenOfLoop= Math.min(word1.length(), word2.length());
        char []result=new char[word1.length()+word2.length()];
        int j=0;
        int k=0;
        for(int i=0;i<2*lenOfLoop;i++)
        {
            if(i%2 == 0)
            {
                result[i]=word1chars[j++];
            }
            else
            {
                result[i]=word2chars[k++];
            }

        }
        if(word1chars.length>word2chars.length)
        {
            System.arraycopy(word1chars,lenOfLoop,result,2*lenOfLoop,word1chars.length-lenOfLoop);
        }
        else
        {
            System.arraycopy(word2chars,lenOfLoop,result,2*lenOfLoop,word2chars.length-lenOfLoop);
        }
        return new String(result);
    }
}
