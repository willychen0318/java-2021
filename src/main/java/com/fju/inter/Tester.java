package com.fju.inter;

public class Tester {
    public static void main(String[] args) {
        //Reporter report=new Reporter();
        //implement cant new !!
        Reporter reporter=new WeatherReporter();
        reporter.print();
        Reporter reporter1=new ConstellationReporter();
        reporter1.print();
        //each implement(print) have to write a new class, bad!
        Reporter reporter2=new Reporter() {
            @Override
            public void print() {
                System.out.println("Good");
            }
        };
        Reporter reporter3=new Reporter() {
            @Override
            public void print() {
                System.out.println("Nice");
            }
        };
        reporter2.print();
        reporter3.print();
        //Good implement !!
    }
}
