package com.fju.racing;

public class Horse extends Thread{
    @Override
    public void run() {
        /*super.run();-> thread run=non so delete super.run()*/
        for (int i = 0; i < 10000; i++) {
            System.out.println(getName()+" "+i);//getName() to show Thread's default name
        }
    }
}
