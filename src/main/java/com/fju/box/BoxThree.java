package com.fju.box;

public class BoxThree extends Box /*implements BoxInterface*/{
    public BoxThree(){
        length=10;
        width=10;
        height=10;
    }

    @Override
    //abstract
    public String name() {
        return "Box 3";
    }

    @Override
    public int price() {
        return 60;
    }
}
//Inheritance
//Java inheritance only use one superclass to one subclass,can't use many-to-one(Multiple Inheritance)
//Because when it warning,it's difficult to find the mistake if the inheritance is long and big.