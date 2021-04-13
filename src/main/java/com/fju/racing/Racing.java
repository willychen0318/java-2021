package com.fju.racing;
//Thread exercise
public class Racing {
    public static void main(String[] args) {
        Horse h1= new Horse();//free constructor
        h1.start();//not h1.run()

        /*for (int i = 0; i < 10000; i++) {
            System.out.println("Horse1"+" "+i);
        }main method just work this for(), h2 work itself (Thread-0)*/
        Horse h2= new Horse();
        h2.start();
        HorseRunnable h3=new HorseRunnable();
        Thread thread=new Thread(h3);
        thread.start();
    }


}
