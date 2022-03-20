package com.ps.homeworks;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesup(5)));

    }
    public static int[] seriesup(int num){
        int[] series=new int[num*(num-1)/2];
        int index=0;
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= i; j++) {
                series[index]=j;
                index++;
            }
        }
        return series;
    }
}
