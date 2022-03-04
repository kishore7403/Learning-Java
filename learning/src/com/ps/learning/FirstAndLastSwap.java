package com.ps.learning;

public class FirstAndLastSwap {
    public static void main(String[] args) {
        System.out.println("a    =>"+swapper("a"));
        System.out.println("ab   =>"+swapper("ab"));
        System.out.println("abc  =>"+swapper("abc"));
        System.out.println("abcd =>"+swapper("abcd"));
    }

    public static String swapper(String s){
        return (s.length()==1) ? s : s.charAt(s.length()-1) + s.substring(1, s.length() - 1) + s.charAt(0);

    }
}
