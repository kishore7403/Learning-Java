package com.ps.learning;

public class ForSwitch {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            switch (i){
                case 1,2,3,4,5:
                    System.out.println(i);
                    break;
                default:
                    System.out.println("default value");
                    break;
            }
        }
    }
}
