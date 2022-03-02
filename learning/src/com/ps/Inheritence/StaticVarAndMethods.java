package com.ps.Inheritence;
class StaticPerson{
    static int i=10;
    static void add(int a,int b){
        System.out.println(a+b+i);
    }
    static {
        System.out.println("hi");
    }
}
public class StaticVarAndMethods {
    public static void main(String[] args) {
        StaticPerson.add(2,3);             //static methods dont need object


    }
}
