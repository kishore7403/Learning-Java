package com.ps.Inheritence;
class A{
    A(){
        System.out.println("In a");
    }
    void info(){
        System.out.println("hello A");
    }
}
class B extends A{
    B(){
        System.out.println("In b");
    }
    void info (){
        System.out.println("Hello B");
    }
    void print(){
        System.out.println("hi");
    }
}
class C extends B{
    C(){
        System.out.println("In c");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A b= new B();
        b.info();               //runtime polymorphism (method overriding) dynamic method dispatch
    }
}
