package com;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int result,target;
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        target=in.nextInt();
        result=binarysearch(arr,target);
        System.out.println(result);



    }
    static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid;
        while (start<=end){
            mid=(start+end)/2;     //use mid = start+ ((end-start)/2)  to not exceed int limit
            if (arr[mid]==target){
                return mid+1;
            }

            else if (target<arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
