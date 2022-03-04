package com.ps.learning;

public class PlayingMusic {
    public static void main(String[] args) {
        System.out.println("time =5 playing=True Trouble="+inTrouble(5,true));
        System.out.println("time =7 playing=True Trouble="+inTrouble(7,true));
        System.out.println("time =8 playing=True Trouble="+inTrouble(8,true));
        System.out.println("time =19 playing=True Trouble="+inTrouble(19,true));
        System.out.println("time =20 playing=True Trouble="+inTrouble(20,true));
        System.out.println("time =21 playing=True Trouble="+inTrouble(21,true));

        System.out.println("time =5 playing=False Trouble="+inTrouble(5,false));
        System.out.println("time =7 playing=False Trouble="+inTrouble(7,false));
        System.out.println("time =8 playing=False Trouble="+inTrouble(8,false));
        System.out.println("time =19 playing=False Trouble="+inTrouble(19,false));
        System.out.println("time =20 playing=False Trouble="+inTrouble(20,false));
        System.out.println("time =21 playing=False Trouble="+inTrouble(21,false));

    }
    public static boolean inTrouble(int time,boolean playing){
        return (!(time>=7 && time<=20) && playing);
    }
}
