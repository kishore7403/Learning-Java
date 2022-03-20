package com.ps.box;

public class Box {
    private int l;
    private int b;
    private int h;
    public Box(){
        this.l=1;
        this.b=1;
        this.h=1;
    }
    public Box(int l){
        this();
        this.l=l;

    }
    public Box(int h,int b){
//        this(l);
        this.h=h;
        this.b=b;

    }

    public Box(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

}
