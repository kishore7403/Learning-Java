package com.ps.overload;

public class Puppy {
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.bark(22);
        d1.bark(2222L);
        d1.bark("hi",2);
        d1.bark(2,"hi");
    }

}
