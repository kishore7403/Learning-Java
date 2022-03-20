package com.ps.homeworks;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(checker("xxaxx"));

    }
    public static String checker(String s){
        String res =s;
        if (s.length()==1){
            return res;
        }
        else if (s.length()==2){
            return s.charAt(0)==s.charAt(1) ? ""+s.charAt(0) : s;
        }
        else {}
        while(!s.equals("")) {
            int mid=(s.length()-1)/2;
            if(s.substring(0,mid+1).equals(s.substring(mid+1,s.length()))){
                res= s.substring(0,mid+1);
                return res;
            }
            else {
                s=s.substring(0,mid)+s.substring(mid+1,s.length());
            }
        }
        return res;
    }
}
