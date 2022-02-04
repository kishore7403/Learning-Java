package com;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int[] arr={1,2,5,8,1,45,6,5,2,5,2,5,2,2,6,33,8,8,8,};
        Scanner in =new Scanner(System.in);
        int target=in.nextInt();
        int result=Lsearch(arr,target);
        if (result==-1){
            System.out.println("not found");
        }
        else {
            System.out.println("Found at " + (result + 1));
        }
    }
    static int Lsearch(int arr[],int target){
        if (arr.length==0){
            return -1;
        }
        else{
            for (int i = 0; i < arr.length ; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }

}
