package com.java.dsa.leetCode;

/*
Spiral matrix problem (m * n matrix)
  1  2  3  4
  5  6  7  8
  9 10 11  12
  13 14 15 16
  Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 */
public class SpiralMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int srow = 0;
        int erow = matrix.length - 1;
        int scol = 0;
        int ecol = matrix[0].length - 1;

        while (srow <= erow && scol <= ecol) {
            for (int i = srow; i <= ecol; i++) {
                System.out.print(matrix[srow][i] + " ");
            }
            for (int j = srow + 1; j <= erow; j++) {
                System.out.print(matrix[j][ecol] + " ");
            }
            for (int k = ecol - 1; k >= scol; k--) {
                System.out.print(matrix[erow][k] + " ");
            }
            for (int l = erow - 1; l > srow; l--) {
                System.out.print(matrix[l][scol] + " ");
            }
            srow++;
            scol++;
            erow--;
            ecol--;

        }
    }
}
