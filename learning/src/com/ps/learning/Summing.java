package com.ps.learning;

public class Summing {
    public static void main(String[] args) {
        System.out.println("a==b "+sumtwo(3,3));
        System.out.println("a!=b "+sumtwo(4,3));
    }
    public static int sumtwo (int a,int b){
        return (a==b) ? a+b:(a+b)*2;
    }
}
