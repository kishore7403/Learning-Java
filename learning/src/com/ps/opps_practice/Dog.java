package com.ps.opps_practice;

public class Dog {
    public float height;
    public float weight;

    public void bark(){
        System.out.println("Barking"+" My height:"+height+" My weight:"+weight);
    }
    public boolean equals(Dog d){
        return this.height==d.height && this.weight==d.weight;
    }
}
