package com;

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {
        int[] arr=new int[5];
        int n;
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <arr.length; i++) {
            arr[i]= in.nextInt();
        }
        n=arr.length;
//        arr=BubbleSort(arr,n);
//        for(int i: arr){
//            System.out.print(i+" ");
//        }
        arr=SelectionSort(arr,n);
        for(int i: arr){
            System.out.print(i+" ");
        }


    }
    static int[] BubbleSort(int[] arr,int n){
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]<arr[j+1]){
                    Swapper(arr,j,j+1);
                }
            }
        }
        return arr;
    }
    static int [] SelectionSort(int[] arr,int n){
        for (int i = 0; i <n-1 ; i++) {
            int min_idx=i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            Swapper(arr,min_idx,i);

        }

        return arr;
    }
    static void Swapper(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
