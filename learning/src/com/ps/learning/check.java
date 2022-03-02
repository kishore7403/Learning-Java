package com.ps.learning;

public class check {
    public static void main(String[] args) {
        int[] nums= {5,5,6,7,2,8};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                System.out.print(i);
                System.out.println(j);
            }
        }
    }
}
