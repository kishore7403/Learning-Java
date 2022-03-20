package com.ps.homework;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println(replacer("xaax","aa", "$$$"));
        System.out.println(replacer("aaaaabcaa","aa", "$$$"));
        System.out.println(replacer("xyz","aa", "%%%"));

    }
    public static String replacer(String s,String target,String replacement){
        if(s==null || s.isBlank()){
            return s;
        }
        if(s.isEmpty()){
            return "";
        }
        return s.replace(target,replacement);
    }
}
