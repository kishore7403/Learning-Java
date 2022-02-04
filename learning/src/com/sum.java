package com;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int result=sum(1,3);
        System.out.println(result);

    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c) {
        return a + b + c;
    }
    static int sum(){
        Scanner in =new Scanner(System.in);
        int num1= in.nextInt();
        int num2= in.nextInt();
        return num1+num2;

    }
}
