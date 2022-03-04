package com.ps.learning;

public class RepeatString {
    public static void main(String[] args) {
        System.out.println("        =>"+repeater(""));
        System.out.println("a       =>"+repeater("a"));
        System.out.println("ab      =>"+repeater("ab"));
        System.out.println("abc     =>"+repeater("abc"));
        System.out.println("java    =>"+repeater("Java"));
        System.out.println("kishore =>"+repeater("kishore"));
    }
    public static String repeater(String s){
        return (s.length()<=3)? (s+" "+s+" "+s) : (s.substring(0,3)+" "+s.substring(0,3)+" "+s.substring(0,3));
    }
}
