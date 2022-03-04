package com.ps.learning;

public class SubstringSplit {
    public static void main(String[] args) {
        System.out.println("Kitten (1) =>"+removeIdx("Kitten",1));
        System.out.println("Kitten (2)=>"+removeIdx("Kitten",2));
        System.out.println("Kitten (0)=>"+removeIdx("Kitten",0));
        System.out.println("Kitten (5)=>"+removeIdx("Kitten",5));
        System.out.println("Kitten (10)=>"+removeIdx("Kitten",10));
        System.out.println("null   (10)=>"+removeIdx(null,10));
        System.out.println("K (1)=>"+removeIdx("k",0));
        System.out.println("     =>"+removeIdx("  ",0));
        System.out.println("     =>"+removeIdx("",0));
    }
    public static String removeIdx(String s,int idx){
        if(s==null || s.isBlank() || s.isEmpty()){
            return "Null or empty/blank String";
        }
        if (idx<s.length() && idx>=0) {
            return s.substring(0, idx) + s.substring(idx + 1, s.length());
        }
        return "Invalid operation";
    }
}
