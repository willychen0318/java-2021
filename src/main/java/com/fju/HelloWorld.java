package com.fju;

import java.util.Scanner;
import java.util.function.Consumer;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        /*Student[] students = {
                new Student("1101", "Eric", 60, 50),
                new Student("1102", "Keen", 50, 30),
                new Student("1103", "Jack", 60, 10),
                new Student("1104", "Willy", 90, 90)
        };
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }*/
       Customer[] customers={
               new Customer(13,490,0),
               new Customer(52,1000,100),
               new Customer(81,290,0),
               new Customer(2122,2000,200)
       };

        /*Customer[] customers={
                new Customer(0001,100,20),
                new Customer(100,120,20)
        };*/
        for (int l = 0; l < customers.length; l++) {
            customers[l].print_cost();
        }
    }
}
