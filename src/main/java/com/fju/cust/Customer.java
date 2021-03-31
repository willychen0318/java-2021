package com.fju.cust;

public class Customer {
    String id;
    int amount;
    public Customer(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public Customer(){
        super();//to use extends(refer to SilverCustomer)
    }
    public int getTotal() {
        return amount;
    }
}
