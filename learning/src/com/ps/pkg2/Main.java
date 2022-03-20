package com.ps.pkg2;

import com.ps.tedd.Interface;

public class Main {

    public static void main(String[] args) {

        DisplayManager d1=new DisplayManager();
        d1.packageName();

        com.ps.pkg1.DisplayManager d2=new com.ps.pkg1.DisplayManager();
        d2.packageName();

    }
}
