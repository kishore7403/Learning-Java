package com.ps.homeworks;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(""+close(5,5));
        System.out.println(""+close(9,12));
        System.out.println(""+close(5,12));
    }
    public static int close(int a,int b){
        if(Math.abs(10-a)==Math.abs(10-b)){
            return 0;
        }
        else {
            return (Math.abs(10-a)<Math.abs(10-b)? a:b);
        }
    }
}
