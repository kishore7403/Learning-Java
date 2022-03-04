package com.ps.Inheritence;

class Animals{
    public String name;
    public double weight;


    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }

    public void Sound(){
        System.out.println("Animal is making sound");
    }
//    static {
//        System.out.println("hi");     //runs when class is insatantiated only once
//    }
}

class Dog extends Animals{
    private String hairCoat;
    public void sound(){
        System.out.println("Barking");
    }

    public void setHairCoat(String hairCoat) {
        this.hairCoat = hairCoat;
    }

    public String getHairCoat() {
        return hairCoat;
    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
//        Dog d1= new Dog();
//        d1.name="tiger";
//        d1.weight=20;
//        Dog d2= d1;
//        d1=null;
//        System.out.println(d2.name);

        Dog d1= new Dog();
        d1.name="tiger";
        d1.weight=20;
        Dog d2= null;
        d1=d2;
        System.out.println(d1);
//        Dog d1= new Dog();
//        d1.sound();
    }
}
