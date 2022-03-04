package com.ps.tedd;

interface Runnable{
    public void run();
    default void summary(){
        System.out.println("Summary");
    }
}
class Run  implements Runnable{
    @Override
    public void run() {
        System.out.println("person is running");
    }

//    @Override
//    public void summary() {
//        System.out.println("he");
//    }
}


public class Interface {
    public static void main(String[] args) {
        Run runner=new Run();
        runner.run();
        runner.summary();
    }

}
