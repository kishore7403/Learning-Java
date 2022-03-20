package com.ps.homeworks;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println(countDigit("12ffhvghhvhgvh345"));
    }
    public static int countDigit(String s){
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isDigit(s.charAt(i))){
                sum=sum+Integer.parseInt(""+s.charAt(i));
            }
        }
        return sum;
    }
}
