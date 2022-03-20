package com.ps.learning;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(10);
    }
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        System.out.println(fibo(n-1)+fibo(n-2));
        return fibo(n-1)+fibo(n-2);

    }
}

