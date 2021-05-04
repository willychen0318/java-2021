package com.fju.test;

public class tester {
    public static void main(String[] args) {
        //Box1 box1=new Box1();
        //Box2 box2=new Box2(); =>bad box
        //leftBox2 <=> rightBox2() but in this array ,Box[] not equal to Box1(), Box2(),.....
        //Because in java,parent's datatype can equal to child's datatype(int, double.....)
        //This is java polymorphism.
        //Ex.Box box= new Box();[O]
        //   Box box= new Box1();[O]
        //   Box1 box= new Box();[X]
        Box[] boxes={new Box1(), new Box2(), new Box3(), new Box4(), new Box5(), new Box6()};
        int length=7;
        int width=5;
        int height=5;

       /*if (boxes[0].validate(length, width, height)) {
            System.out.println(boxes[0]);
        }else....*/

        for (Box box:boxes) {
            //Box1 box1=(Box1) box;
            //Box[0]=new Box1();
            //Box[1]=new Box2();.......
            //If Box is not be defined,it will not default 0 but Null.
            //Ex=>System.out.println(Box[3].name);=>Exception
            if (box.validate(length, width, height)) {
                System.out.println(box.name+" it is!");
                break;
            }
        }




    }
}
