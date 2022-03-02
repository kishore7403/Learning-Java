package com.ps.Inheritence;

class concatination {
    public String concatinate(String a,String b){
        a=a+"India";
        System.out.println(a);
        return a+b;

    }
}
public class Concat {
    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        concatination c1= new concatination();
        String res=c1.concatinate(s1,s2);
        System.out.println(res);
        System.out.println(s1);
    }


}
