package com.ps;

public class Stringcheck {
    public static void main(String[] args) {

    }
    public boolean isStartWithCharA(String s){
        if(s==null || s.length()==0){
            return false;
        }
        if(s.charAt(0)=='a'||s.charAt(0)=='A'){
            return true;
        }
        return false;
    }
}
