package com.ps.homeworks;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("mix =>"+mixStart("mix"));
        System.out.println("9ix =>"+mixStart("9ix"));
        System.out.println("pix =>"+mixStart("pix"));
        System.out.println("piz =>"+mixStart("piz"));
    }

    public static boolean mixStart(String s){
        return (s.charAt(1) == 'i' && s.charAt(2) == 'x');
    }
}
