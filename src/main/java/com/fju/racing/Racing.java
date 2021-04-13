package com.fju.racing;

public class Racing {
    public static void main(String[] args) {
        Horse h2 =new Horse();
        h2.start();
        Horse h1 =new Horse();
        h1.start();
        HorseRunnable h3=new HorseRunnable();
        Thread thread=new Thread(h3);
        thread.start();

    }
}
//First,write two horse racing ,then write Horse method extends Thread .
//Second,use Horse h2 to racing with Horse1
//Third,use Horse change Horse1 to h1.
//Final, write HorseRunnable to write h3 in Racing.