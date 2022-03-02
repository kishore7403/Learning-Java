package com.ps.learning;

public class Swapper {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10,11};
        for(int z: a){
            System.out.print(z+" ");
        }
        int j=a.length-1;
        for (int i = 0;i <a.length/2 ; i++) {

            swap(a,i,j);
            j--;
        }
        System.out.println();
        for(int z: a){
            System.out.print(z+" ");
        }
    }
    static void swap(int[] nums,int a,int b){
        int temp= nums[a];
        nums[a]=nums[b];
        nums[b]= temp;
    }
}
