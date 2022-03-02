package com.ps.learning;

import java.util.Arrays;

public class Myprogram {
    static String name="hi";
    public static void main(String[] args) {
        int i=10;
        int[] arr=new int[10];
        //int[] arr={1,2,3,4,5,6,7,8,9,10};
        int [][] arr2=new int[3][2];
        int [][] arr3=new int[3][];
        arr3 [0]=new int[2];
        arr3 [1]=new int[3];
        for (int j = 0; j < arr3.length ; j++) {
            System.out.println(Arrays.toString(arr3[j]));
        }
        System.out.println(Arrays.deepToString(arr3));
        System.out.println(Arrays.toString(arr));
        {
            System.out.println(name);
            int j=20;

        }
        {
            System.out.println(name);
            int k=30;

        }
    }
}
