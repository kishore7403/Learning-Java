package com.ps.learning;

public class InfinteBreak {
    public static void main(String[] args) {
        int i=0;
        while(true){
            if(i%2==0){
                System.out.println(i);
            }
            if(i==30){
                break;
            }
            i++;
        }
    }
}
