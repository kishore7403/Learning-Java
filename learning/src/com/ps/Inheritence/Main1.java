package com.ps.Inheritence;

class Person{
    String name;
    int age;
    String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void showAge(int age,String name){
        System.out.println(age);
        System.out.println(name);
    }
//    public String showAge(int age,String email){
//        System.out.println(age);
//        System.out.println(email);
//
//    }
}


public class Main1 {
    public static void main(String[] args) {
//        Person p1=new Person("kishore",22,"kishore@gmail.com");
//        System.out.println(p1.name);
//        Person p2= new Person();
        Person p1=new Person("kishore",22,"kishore@gmail.com");
        p1.showAge(10,"hello");
    }

}
