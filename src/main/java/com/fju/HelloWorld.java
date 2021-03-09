package com.fju;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Student[] students = {
                new Student("1101", "Eric", 60, 50),
                new Student("1102", "Keen", 50, 30),
                new Student("1103", "Jack", 60, 10),
                new Student("1104", "Willy", 90, 90)
        };
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
    }
}
