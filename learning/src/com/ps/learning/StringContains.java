package com.ps.learning;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        System.out.println("not Good returns: "+isNot("not Good"));
        System.out.println("Good returns: "+isNot("Good"));
        System.out.println("Not bad returns: "+isNot("Not bad"));
        System.out.println("Bad returns: "+isNot("Bad"));
        System.out.println("NOT returns: "+isNot("NOT"));
        System.out.println("    returns: "+isNot(""));
        System.out.println("    returns: "+isNot(" "));
        System.out.println("null returns: "+isNot(null));
    }
    public static String isNot(String s){
        if (s==null){
            return "Null";
        }
        String c=s;
        if (c.toLowerCase().startsWith("not")){
            return c;
        }
        return c="not "+s;
    }
}
