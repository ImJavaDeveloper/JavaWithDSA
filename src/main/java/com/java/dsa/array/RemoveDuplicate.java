package com.java.dsa.array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int l=nums.length;
        int reader =0;
        int writer =0;
        int j=0;
        while(reader<l)
        {
            while(reader<l && nums[reader]==nums[writer])
            {
                reader++;
            }

            nums[j]=nums[writer];
            j++;
            writer=reader;

        }
        System.out.println("After removing duplicates");
        for(int i=0;i<j;i++)
        {
            System.out.print(nums[i]+" ");
        }


    }
}
