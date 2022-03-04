package com.ps.cricket;

public class PlayerInfo {
    String name;
    private int runscored;
    protected int stamina;
    public int ranking;

    void printName(){
        System.out.println("name");
    }

    private void printRunsScored(){
        System.out.println("runs");
    }
    protected void printStamina(){
        System.out.println("stamina");
    }
    public void printRanking(){
        System.out.println("ranking");
    }
}
