package com.ps.learning;

class Cricketer{
    private String name;
    private int runsScored;

    public void setName(String name) {
        this.name = name;
    }

    public void setRunsScored(int runsScored) {
        if (runsScored>0){
            this.runsScored = runsScored;
        }

    }

    public String getName(){
        return name;
    }

    public int getRunsScored() {
        return runsScored;
    }
}

public class Oops {
    public static void main(String[] args) {
        Cricketer cricketer= new Cricketer();
        cricketer.setName("kishore");
        cricketer.setRunsScored(100);
        System.out.println(cricketer.getName());
        System.out.println(cricketer.getRunsScored());
    }
}
