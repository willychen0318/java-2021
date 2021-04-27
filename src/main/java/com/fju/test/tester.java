package com.fju.test;

public class tester {
    public static void main(String[] args) {
        //Box1 box1=new Box1();
        //Box2 box2=new Box2(); bad box
        Box[] boxes={new Box1(), new Box2(), new Box3(), new Box4(), new Box5(), new Box6()};
        int length=7;
        int width=5;
        int height=5;

       /*if (boxes[0].validate(length, width, height)) {
            System.out.println(boxes[0]);
        }else....*/

        for (Box box:boxes) {
            if (box.validate(length, width, height)) {
                System.out.println(box.name+" it is!");
                break;
            }
        }




    }
}
