package com.fju;

import java.util.Scanner;

public class Customer {
    Scanner sc=new Scanner(System.in);

    int CustomerId;
    int Consumption;
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