package com.ps.learning;

import java.util.List;
import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");
//        int a=10;
//        int b=20;
//        int c=a+b;
//        System.out.println(c);
        byte b=64;  //1bit
        short s=120; //16 bit
        int i =5034; //32 bit
        long l=12344l; //64 bit

        float f=1.32f;
        double d=2.45;

        char c='a';
        char c1=65+2;
        System.out.println(c1);
        boolean bool=true;
        System.out.println(bool);
        String str="Kishore";
        String str2="Kishore";
        System.out.println(str2==str);
        String fname=new String("Hello World");
        String lname=new String("Ganesh");
        String mname="helo";
        System.out.println(fname==lname);
        System.out.println(lname==mname);

        System.out.println(fname.substring(2));
        System.out.println(fname.charAt(0));
        System.out.println(fname.substring(0,0));
        System.out.println(fname.toLowerCase());
        System.out.println(fname.contains("ore"));
        System.out.println(fname.toUpperCase());
        System.out.println(fname.indexOf("o",5));//inclusive
        //System.out.println(fname.replace("World","chennai"));
        System.out.println(fname.replaceAll("o","e"));
        System.out.println(fname.trim());
        System.out.println(fname.startsWith("H"));
        System.out.println(fname.endsWith("d"));
        String blank="  ";
        System.out.println(blank.isBlank());
        System.out.println(blank.length());
        System.out.println(fname.contains("World"));
        int bn= 0b1000001; //0b binary number
        System.out.println(bn);

        int oct=0745;    // 0 represents octal  (8^0)*7+(8^1)*4+....
        System.out.println(oct);

        int hex=0x3de;  //0x represents hex
        System.out.println(hex);

        int phone=981_888_949;
        System.out.println(phone);
        int phone_bin=0b0001_0101_0111;
        System.out.println(phone_bin);

        float value =6E23f;  //E for exponenet and f for float
        System.out.println(value);
        System.out.println(value*10);

        float value1=9_88_487.4_9_2_3f;
        System.out.println(value1);

        char value3='\u0063'; //unicode char
        System.out.println(value3);

        String sentence="hello \"ps\"";  // "" inside String
        System.out.println(sentence);

//        int num=1000l;
//        System.out.println(num);
//        java: incompatible types: possible lossy conversion from long to int

        int number =(int)(1020005l);
        System.out.println(number);

        byte byte_val=127;
        System.out.println(byte_val);

        int number3=10;
        byte b1=(byte)number3;
        System.out.println(b1);

        short s4=321;
        byte b4=(byte)s4;
        System.out.println(b4);

        double d1=3.14F;
        int i1=(int)d1;
        System.out.println(i1);

        byte b5=30,c4=100;
        int d4;
        d4=b5+c4;
        System.out.println(d4);
        }


}
