package com.fju.box;

public abstract class Box {
    int length;
    int width;
    int height;

    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public abstract String name();//abstract -> between interface(規範) and public

    public abstract int price();
}
