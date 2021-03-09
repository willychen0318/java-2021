package com.fju;

public class Student {

    String id;
    String name;
    int english;
    int math;

    public Student(String id,String name, int english, int math) {
        this.id= id;
        this.name= name;
        this.english= english;
        this.math= math;
    }
    public void print(){
        System.out.println(id+"\t"+name+"\t"+english+"\t"+math+"\t"+(math+english)/2);
    }

}

