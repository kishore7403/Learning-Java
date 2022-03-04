package com.ps.Inheritence;
class A{
    A(){

        System.out.println("In a");
    }
    void info(){
        System.out.println("hello A");
    }
//    void print(){
//        System.out.println("hi A");
//    }
}
class B extends A{
    B(){
        System.out.println("In b");
    }
    void info (){
        System.out.println("Hello B");
    }
    void print(){
        System.out.println("hi B");
    }
}
class C extends B{
    C(){
        System.out.println("In c");
    }
    void info (){
        System.out.println("Hello C");
    }
    void print(){
        System.out.println("hi C");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        A b= new B();
        b.info();       //runtime polymorphism (method overriding) dynamic method dispatch
//        b.print();
//        B a= new A();

    }
}
