package com.java.dsa.array.leetCode;

import java.util.ArrayList;
import java.util.List;

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
