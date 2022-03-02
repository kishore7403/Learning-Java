package com.ps.learning;

public class Scope {
    public static void main(String[] args) {
        int a=100;
        int b=50;
        {
            a=0;
            int c=45;
            System.out.println(a);
            System.out.println(c);
        }
        System.out.println(a);
        System.out.println(b);
    }
}
