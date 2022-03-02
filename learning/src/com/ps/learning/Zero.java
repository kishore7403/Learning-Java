package com.ps.learning;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        int[] nums={0};
        moveZeroes(nums);

    }
    static void moveZeroes(int[] nums){
        int[] result=new int[nums.length];
        int count=0;
        int j=0;

        for(int i=0;i<nums.length;i++) {
            if (nums[i] != 0) {
                result[j] = nums[i];
                j++;
            }
        }
        for (int z=0;z<result.length;z++){
            System.out.print(result[z]+" ");
        }
    }
}
