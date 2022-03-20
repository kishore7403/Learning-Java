package com.ps.learning;

public class StringCompare {
    public static void main(String[] args) {
        System.out.println(compareRef("hello","hello"));
        System.out.println(compareRef(new String("hello"),"hello"));
        System.out.println(compareRef(new String("hello"),new String("hello")));
        System.out.println();
        System.out.println(compareVal("hello","hello"));
        System.out.println(compareVal(new String("hello"),"hello"));
        System.out.println(compareVal(new String("hello"),new String("hello")));
    }
    public static boolean compareRef(String s1,String s2){
        return (s1==s2);

    }
    public static boolean compareVal(String s1,String s2){
        return s1.equals(s2);
    }
}
