package com.ps.learning;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int res=factorial(num);
        System.out.println(res);
    }
    public static int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
