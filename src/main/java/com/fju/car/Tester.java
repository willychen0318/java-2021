package com.fju.car;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        Car c1=new Car("DX-2707");
        System.out.println(c1.enter);
        Date now=new Date();//now time
        System.out.println(now.getTime());//getTime is a long time start from 1970
        long distance =now.getTime()-c1.enter.getTime();//calculate enter~out time
        System.out.println(distance);

        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");//have to search how to use pattern
        //try to put time into Date
        try {
            Date d=sdf.parse("08:58");
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }//parse exception

        Calendar cal=Calendar.getInstance();
        //use Calendar to put time and calculate
        System.out.println(cal.getTime());//Date ~= Calender

        Map<String,Car> cars=new HashMap<>();//Map<Key,Find>
        //Collection, Set, "Map"
        Car c2=new Car("NAE-6593","07:30");
        cars.put(c2.id,c2);
        String id="NAE-6593";
        Car car=cars.get(id);
        //id(String) is key and find the output(Car)
        if(car==null){
            System.out.println("Car not found");
        }else {
            Date today=new Date();
            long dis=today.getTime()-car.enter.getTime();
            long mins=dis/(1000*60);
            System.out.println(mins);
        }
    }
}
