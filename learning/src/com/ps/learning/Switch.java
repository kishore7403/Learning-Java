package com.ps.learning;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruit=in.next();

//        if (fruit.equals("mango")){
//            System.out.println("ya");

        switch (fruit) {
            case "Mango" -> System.out.println("king");
            case "apple" -> System.out.println("red");
            default -> System.out.println("no");
        }


        }
    }

