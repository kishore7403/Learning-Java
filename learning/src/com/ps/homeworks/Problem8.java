package com.ps.homeworks;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println(adjChars("aaaaaaaaaaabbbbbbbbqqqqqqqqqq"));
    }
    public static int adjChars(String s){
        int temp=1;
        int maxadjcount=0;
        char prev= s.charAt(0);
        for (int i = 1; i <s.length() ; i++) {
            if((s.charAt(i)==prev)){
                temp++;
                if(temp>maxadjcount) {
                    maxadjcount = temp;
                }
            }
            else {
                temp=1;
            }

            prev=s.charAt(i);
        }
        return maxadjcount;
    }
}

