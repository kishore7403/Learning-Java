package com.ps.InitializationOrder;

class Insect {
    private final int i = printInit("Insect initailized..");
    protected int j;

    {
        System.out.println("inside Insect instance init");
    }

    Insect() {
        System.out.println("i =" + i + ",j= " + j);
        j = 39;
    }
    static {
        System.out.println("static block Insect initialized.");
    }
    private static final int x1 = printInit("static Insect.x1 initialized");



    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}