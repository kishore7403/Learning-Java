package com.ps.learning;

public class Sumtwo {
    public static void main(String[] args) {
        System.out.println("a=10 b=5 "+sumTen(10,5));
        System.out.println("a=10 b=10 "+sumTen(10,10));
        System.out.println("a=5 b=10 "+sumTen(5,10));
        System.out.println("a=5 b=5 "+sumTen(5,5));
        System.out.println("a=6 b=5 "+sumTen(6,5));
        System.out.println("a=-20 b=30 "+sumTen(-20,30));
    }
    public static boolean sumTen(int a,int b){
//        if ((a==10 || b==10)||(a+b==10)){
//            return true;
//        }
//        return false;

        return ((a==10 || b==10)||(a+b==10));
    }
}
