package com.company;

import java.sql.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        Building home= new Building("Здание 1");
        Room room0=new Room("Комната 1",100,5);
        home.addRoom(room0);
        Room room1=new Room("Комната 2",125,3);
        Bulb bulb0=new Bulb(100);
        Bulb bulb1=new Bulb(90);
        Bulb bulb2=new Bulb(7200);
        home.addRoom(room1);
        Furniture furniture0=new Furniture(71);
        home.getRoom(1).addIllum(bulb0);
        home.getRoom(1).addIllum(bulb1);
        home.getRoom(1).addFitniture(furniture0);
        home.getRoom(0).addIllum(bulb2);
        home.out();
    }
}
