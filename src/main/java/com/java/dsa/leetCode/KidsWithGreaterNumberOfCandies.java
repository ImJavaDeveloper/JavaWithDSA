package com.java.dsa.leetCode;

import java.util.ArrayList;
import java.util.List;
/*There are n kids with candies. You are given an integer array candies, where each candies[i]
 represents the number of candies the ith kid has, and an integer extraCandies, denoting the number
  of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest number of candies among
all the kids, or false otherwise.*/
public class KidsWithGreaterNumberOfCandies {

        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> results = new ArrayList<Boolean>();
            int left = 0;
            int right = candies.length - 1;
            for (int i = 0; i < candies.length; i++) {
                Boolean leftResult = true;
                Boolean rightResult = true;
                // Leftward
                for (int j = i - 1; j >= 0; j--) {
                    if ((candies[i] + extraCandies) < candies[j]) {
                        leftResult = false;
                        break;
                    }
                }
                // Rightward
                for (int k = i; k < candies.length;k++) {
                    if ((candies[i] + extraCandies) < candies[k]) {
                        rightResult = false;
                        break;
                    }
                }
                results.add(leftResult && rightResult);
            }
            return results;
        }

}
