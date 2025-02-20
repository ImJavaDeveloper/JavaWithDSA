package com.java.dsa.matrix;
/*
Problem to rotate the 2D array by 90 degree
int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
Result=
      7 4 1
      8 5 2
      9 6 3
 */
public class Rotate2DArray {
    public static void main(String[] args) {
        System.out.println("Rotate Array Image by 90 degree clockwise");
        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int srow=0;
        int erow=matrix.length-1;
        int scol=0;
        int ecol=matrix[0].length-1;
        //Getting Transpose of matrix
        while(srow<erow && scol<ecol)
        {

            for(int j=scol;j<=ecol;j++)
            {
                int temp=matrix[srow][j];
                matrix[srow][j]=matrix[j][srow];
                matrix[j][srow]=temp;
            }
            srow=srow+1;
            scol=scol+1;
        }

        //Reverse Each Row

        for(int i=0;i<matrix.length;i++)
        {
            int left=0;
            int right=matrix[i].length-1;
            while(left<=right)
            {
                int temp=matrix[i][right];
                matrix[i][right]=matrix[i][left];
                matrix[i][left]=temp;
                left++;
                right--;
            }
        }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
