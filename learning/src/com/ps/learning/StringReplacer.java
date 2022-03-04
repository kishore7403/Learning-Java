package com.ps.learning;

public class StringReplacer {
    public static void main(String[] args) {
        System.out.println("adel =>"+replacer("adel"));
        System.out.println("ad =>"+replacer("ad"));
        System.out.println("adelaaaaaaaaaaa =>"+replacer("adelaaaaaaaaaaa"));
        System.out.println("adeldeldeldel =>"+replacer("adeldeldeldel"));

    }

    public static String replacer(String s){

        if(s.length()>=4 && s.substring(1,4).equals("del")){
            s=s.replaceFirst("del","");
            return s;
        }
        return s;
    }
}
