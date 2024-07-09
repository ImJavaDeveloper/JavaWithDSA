package com.java.dsa.array.leetCode;

public class GreatestCommonDivisorString {

        public String gcdOfStrings(String str1, String str2) {

            int len1 = str1.length();
            int len2 = str2.length();

            if (len2 > len1) {
                String temp = str1;
                str1 = str2;
                str2 = temp;

                int temp1 = len1;
                len1 = len2;
                len2 = temp1;
            }

            if (!str1.startsWith(str2)) {
                return "";
            }
            if (!((str1+str2).equals(str2+str1))) {
                return "";
            }
            // Repeat the Euclidean algorithm until the second string divides the first

            while (len2 > 0) {
                int temp = len2;
                len2 = len1%len2;
                len1 = temp;
                if (len2 > 0) {
                    str1 = str2;
                    str2 = str1.substring(len1 - len2, len1);
                }

            }

            return str2;

        }

}
