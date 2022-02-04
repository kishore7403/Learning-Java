package com;

public class panagram {

    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int[] op=new int [gain.length+1];
        op[0]=0;
        int max=0;
        for (int i=1;i<gain.length;i++){
            op[i]=op[i-1]+gain[i-1];
            System.out.print(op[i-1]);
            System.out.println(gain[i-1]);
            if(op[i]>max){
                max=op[i];
            }
        }
        System.out.println(max);
        }

    }
