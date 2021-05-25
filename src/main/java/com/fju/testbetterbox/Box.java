package com.fju.testbetterbox;

public class Box {
    int length;
    int width;
    int height;
    String name;
    public boolean validate(int a, int b, int c){
        if(length>=a&&width>=b&&height>=c){
            return true;
        }else return false;
    }



}
