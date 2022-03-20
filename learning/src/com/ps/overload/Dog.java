package com.ps.overload;

public class Dog {
    public int i;
    public void bark(int i){
        System.out.println("Int bark");
    }
    public void bark(long i){
        System.out.println("long bark");
    }

    public void bark(String s,int I){
        System.out.println("String + I");
    }
    public void bark(int I,String s){
        System.out.println("I + String");
    }

}
