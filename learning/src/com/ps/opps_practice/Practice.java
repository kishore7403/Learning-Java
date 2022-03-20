package com.ps.opps_practice;

public class Practice {
    private int age;
    private int roll_no;

    public Practice() {
        System.out.println("default constructor");
        this.age=0;
        this.roll_no=0;
    }
    public Practice(int age){
        System.out.println("single arg constructor");
        this.age=age;
    }
}
