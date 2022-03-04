package com.ps.learning;

public class Holiday {
    public static void main(String[] args) {
//        System.out.println("Weekday=false vacation:false " +sleepn(false,false));
//        System.out.println("Weekday=true  vacation:false "+sleepn(true,false));
//        System.out.println("Weekday=false vacation:true  "+sleepn(false,true));
//        System.out.println("Weekday=true  vacation:true  "+sleepn(true,true));
    }
    public static boolean sleepn(boolean weekDay, boolean vacation){
        boolean res=true;
        if(vacation){
            res= true;
        }
        else if(weekDay){
            res= false;
        }
        return res;
        // return (vacation|| !weekday)
    }
}
