package com.ps.Inheritence;

class FinalPerson{
    private final int i=0;
    private final int j;  //this line gives error if we dont specify a value during intialization since its declared final (can be overcomed by assigning a value thorugh constructor and that the only way )

    FinalPerson(int j) {
        this.j = j;
    }
}
public class FinalInClass {
    public static void main(String[] args) {
        FinalPerson p1 =new FinalPerson();
    }
}
