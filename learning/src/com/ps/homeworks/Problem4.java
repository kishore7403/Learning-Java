package com.ps.homeworks;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("1 2 3 =>"+greatest(1,2,3));
        System.out.println("1 3 2 =>"+greatest(1,3,2));
        System.out.println("3 2 1 =>"+greatest(3,2,1));

    }
    public static int greatest(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }
}
