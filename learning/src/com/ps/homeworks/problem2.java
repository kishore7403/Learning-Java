package com.ps.homeworks;

import com.ps.learning.StringReplacer;

public class problem2 {
    public static void main(String[] args) {
        System.out.println("ozeex =>"+ startOZ("ozeex"));
        System.out.println("ozymandias =>"+ startOZ("ozymandias"));
        System.out.println("bzoo =>"+ startOZ("bzoo"));
        System.out.println("oxx =>"+ startOZ("oxx"));
    }
    public static String startOZ(String s){
        String c="";
        if ((s.charAt(0)=='o' || s.charAt(0)=='O') && (s.charAt(1)=='z' || s.charAt(1)=='Z')){
            s= s.substring(0,2);
        }
        else if((s.charAt(0)=='o' || s.charAt(0)=='O')){
            s= ""+s.charAt(0);
        }
        else if ((s.charAt(1)=='z' || s.charAt(1)=='Z')){
            s= ""+s.charAt(1);
        }
        return s;
    }
}
