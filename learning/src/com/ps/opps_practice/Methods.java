package com.ps.opps_practice;

public class Methods {
    private int age;
    private String name;
    public boolean voter;
    int rollno;
    protected long ph_no;
    static String sayBye="bye";
    static int change=22;

//    public Methods(int rollno,long ph_no,boolean voter){
//        this.rollno=rollno;
//        this.ph_no=ph_no;
//        this.voter=voter;
//    }

    public static String sayBye(){
        return sayBye;
    }
    public void sayHi(){
        System.out.println("hi");
    }
    public void setI(int i) {
        this.age = i;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
