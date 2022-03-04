package com.ps.learning;

public class StringCopies {
    public static void main(String[] args) {
        System.out.println(makeCopies("hi",6));

    }
    public static String makeCopies(String s,int n){
        return (n==1) ? s : s+" "+makeCopies(s,n-1);
    }
}
