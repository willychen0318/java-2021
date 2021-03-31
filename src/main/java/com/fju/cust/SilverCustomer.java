package com.fju.cust;

public class SilverCustomer extends Customer {
    float discount = 0.1f;

    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    //Class default inheritance java.lang.Object,so we need to change default constructor from superclass
    //and write a variable constructor in Customer class.
    @Override
    public int getTotal() {
        return amount - (int)(amount * discount);
    }
}
