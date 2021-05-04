package com.fju.collection;

import com.fju.test.Box;
import com.fju.test.Box1;
import com.fju.test.Box2;

import java.util.ArrayList;

public class ListTester {
    public static void main(String[] args) {
        int[] num=new int[5];
        num[0]=1;
        //num[1]=true [X]
        //num[2]=hank [X]
        //array's homogenous, but arraylist can use "add" to make Heterogeneous.
        ArrayList list=new ArrayList();
        list.add("Hank");

        Integer n=new Integer(123);
        //int n=123;
        //Integer n=123;
        list.add(n);
        //Float, Byte, Double, Long, Short, Character, Boolean, Integer
        list.add(123);//Boxing=>Java let 123=>int then put int into add.

        list.add(true);
        Box1 box=new Box1();
        list.add(box);
        String name=(String)list.get(0);
        String number=(String)list.get(1);
        //Although java.list can do "Heterogeneous", but it's useless because if you want to
        //take element ,it have to trans ,So we can limit list's datatype.
        Box1 box1=new Box1();
        Box2 box2=new Box2();
        ArrayList<Box> boxes=new ArrayList<Box>();
        boxes.add(box1);
        Box b=boxes.get(0);
    }
}
