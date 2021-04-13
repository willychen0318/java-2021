package com.fju.stu;

import java.util.Scanner;

public class Customer {
    Scanner sc=new Scanner(System.in);

    int CustomerId;//java should write constructor yourself(getter and setter).
    int Consumption;//push alt+insert can easy make constructor.
    int Discount;

    public Customer(int customerId, int consumption, int discount) {
        CustomerId = customerId;
        Consumption = consumption;
        Discount = discount;
    }

    public void print_cost(){
        System.out.println("CustomerId:"+CustomerId+"\t"+"Consumption:"+Consumption+"\t"+"Discount:"+Discount+"\t"+"Total:"+(Consumption-Discount));
    }


}
