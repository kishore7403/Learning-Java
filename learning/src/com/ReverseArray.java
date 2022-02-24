package com;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=in.nextInt();
        }
        arr=reverse(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }

    }
    static int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
}
