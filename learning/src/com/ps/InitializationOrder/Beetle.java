package com.ps.InitializationOrder;

class Beetle extends Insect {
    public static void main(String[] args) {
        Beetle b=new Beetle();
        Beetle b1=new Beetle();
    }
    private final int k = printInit("Beetle.k initialized");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static final int x2 = printInit("static Beetle.x2 initialized");

}