package com.ps.learning;

public class AddWithBreak {
    public static void main(String[] args) {
        System.out.println("5+3+2    =>"+adder(5,3,2));
        System.out.println("5+3+13   =>"+adder(5,3,13));
        System.out.println("5+13+13  =>"+adder(5,13,13));
        System.out.println("13+13+13 =>"+adder(13,13,13));
        System.out.println("13+3+2   =>"+adder(13,3,2));
        System.out.println("5+13+2   =>"+adder(5,13,2));
    }
    public static int adder(int a,int b,int c){
        if (a==13){
            return 0;
        }
        if (b==13){
            return a;
        }
        if (c==13){
            return a+b;
        }
        return a+b+c;
    }
}
