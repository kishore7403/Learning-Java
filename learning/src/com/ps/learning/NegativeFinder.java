package com.ps.learning;

public class NegativeFinder {
    public static void main(String[] args) {
//        System.out.println("a=-5 b=-5  flag=true  "+finder(-5,-5,true));
//        System.out.println("a=5  b=-5  flag=true  "+finder(5,-5,true));
        System.out.println("a=-5 b=5   flag=true  "+finder(-8,9,true));
//        System.out.println("a=5  b=5   flag=true  "+finder(5,5,true));
        System.out.println();
//        System.out.println("a=-5 b=-5  flag=false "+finder(-5,-5,false));
//        System.out.println("a=5  b=-5  flag=false "+finder(5,-5,false));
//        System.out.println("a=-5 b=5   flag=false "+finder(-5,5,false));
//        System.out.println("a=5  b=5   flag=false "+finder(5,5,false));
    }
    public static boolean finder(int a,int b, boolean flag){
//        System.out.println(a + ", " + b+ ", "+  flag);
        if(flag && a<0 && b<0){
            System.out.println("Here");
            return true;
        }

        if (flag==false && ((a>0 && b<0))||(a<0 && b>0) ){
            System.out.println("there");
            return true;
        }
        return false;
    }
}
