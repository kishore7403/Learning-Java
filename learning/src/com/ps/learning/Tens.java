package com.ps.learning;


public class Tens {
    public static void main(String[] args) {
        System.out.println("a=85 "+isRange(Math.abs(85),100,200));
        System.out.println("a=90 "+isRange(Math.abs(90),100,200));
        System.out.println("a=95 "+isRange(Math.abs(95),100,200));
        System.out.println("a=100 "+isRange(Math.abs(100),100,200));
        System.out.println("a=105 "+isRange(Math.abs(105),100,200));
        System.out.println("a=115 "+isRange(Math.abs(115),100,200));
        System.out.println("a=210 "+isRange(Math.abs(210),100,200));
        System.out.println("a=190 "+isRange(Math.abs(190),100,200));
        System.out.println("a=195 "+isRange(Math.abs(195),100,200));
        System.out.println("a=200 "+isRange(Math.abs(200),100,200));
        System.out.println("a=205 "+isRange(Math.abs(200),100,200));
        System.out.println("a=210 "+isRange(Math.abs(210),100,200));
        System.out.println("a=215 "+isRange(Math.abs(215),100,200));

        System.out.println("a=-85 "+isRange(Math.abs(-85),100,200));
        System.out.println("a=-90 "+isRange(Math.abs(-90),100,200));
        System.out.println("a=-95 "+isRange(Math.abs(-95),100,200));
        System.out.println("a=-100 "+isRange(Math.abs(-100),100,200));
        System.out.println("a=-105 "+isRange(Math.abs(-105),100,200));
        System.out.println("a=-110 "+isRange(Math.abs(-110),100,200));
        System.out.println("a=-190 "+isRange(Math.abs(-190),100,200));
        System.out.println("a=-195 "+isRange(Math.abs(-195),100,200));
        System.out.println("a=-200 "+isRange(Math.abs(-200),100,200));
        System.out.println("a=-205 "+isRange(Math.abs(-205),100,200));
        System.out.println("a=-210 "+isRange(Math.abs(-210),100,200));
        System.out.println("a=-215 "+isRange(Math.abs(-215),100,200));

    }
    public static boolean isRange(int a,int lower,int upper){
         return ((a>=lower-10 && a<=lower+10) || (a>=upper-10 && a<=upper+10) );
    }
}
