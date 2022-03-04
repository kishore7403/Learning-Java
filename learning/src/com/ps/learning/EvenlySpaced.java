package com.ps.learning;

public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(checker(2,6,10));

    }
    public static boolean checker(int a,int b, int c){
        return ((Math.abs(a-b)==Math.abs(b-c) || Math.abs(a-c)==Math.abs(b-c)));
    }
}
