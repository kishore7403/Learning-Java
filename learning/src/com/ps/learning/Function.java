package com.ps.learning;

public class Function {
    public static void main(String[] args) {
        int[] a={10,50,40};
        change(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }

    static void change(int[] nums){
        nums[0]=40;
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
