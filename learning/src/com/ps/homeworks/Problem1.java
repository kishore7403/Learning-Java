package com.ps.homeworks;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(replacer("xaax","aa", "%%%"));
        System.out.println(replacer("aaaaabcaa","aa", "%%%"));
        System.out.println(replacer("xyz","aa", "%%%"));

    }
    public static String replacer(String s,String target,String replacement){
        return s.replaceAll(target,replacement);
    }
}
