package com.ps.learning;

import java.util.Scanner;

public class Binaryfirstposition {
    public static void main(String[] args) {
        int[] nums=new int[5];
        int result,target;
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=in.nextInt();
        }
        target=in.nextInt();
        result= binaryFirstPositions(nums,target);
        System.out.println(result);
    }
    static int binaryFirstPositions(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while (start<=end){
            mid=(start+end)/2;     //use mid = start+ ((end-start)/2)  to not exceed int limit
            if (target>nums[mid]){
                start=mid+1;
            }
            else {
                end=mid-1;

            }
            System.out.print(start);
            System.out.println(end);
        }
        System.out.println(start);
        return nums[start];
    }
}
