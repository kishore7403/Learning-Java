package com.ps.learning;
public class Smile {
    public static void main(String[] args) {
        System.out.println("a=true b=true "+smiling(true,true));
        System.out.println("a=false b=true "+smiling(false,true));
        System.out.println("a=true b=false "+smiling(true,false));
        System.out.println("a=false b=false "+smiling(false,false));
    }
    public static boolean smiling(boolean a,boolean b){
        return a==b; //return !(a^b);
    }
}
