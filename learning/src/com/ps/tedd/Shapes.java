package com.ps.tedd;

interface Shape{
    public void draw();

}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("draawing circle");

    }
}
public class Shapes {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.draw();
        Rectangle r1=new Rectangle();
        r1.draw();
    }
}
