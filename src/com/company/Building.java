package com.company;

import java.util.ArrayList;

public class Building implements Describe
{
    ArrayList<Room> rooms=new ArrayList<Room>();
    String building;
    String out;
    public Building(String str) {
        this.building = str;
        this.out="";
    }
    public void addRoom(Room room) {
        rooms.add(room);
    }
    public Room getRoom(int index)
    {
        return rooms.get(index);
    }

    @Override
    public String out() {
        for (int number=0;number<rooms.size();number++)
        {
            out+=rooms.get(number).room+'\n'+"Освещенность: "+rooms.get(number).sizeIllumination+"м2( окон : "+rooms.get(number).numWindows;
            for (int count=0;count<rooms.get(number).bulbMas.size();count++)
            {
                if(count==0){
                    out+=" ,";
                }
                out+="лампочка мощностью "+rooms.get(number).bulbMas.get(count).power+"лк ";
                if (count!=rooms.get(number).bulbMas.size()-1)
                {
                    out+="и ";
                }
            }
            out+=");\n";
            out+="Площадь : "+rooms.get(number).numSquare+"м2( занято "+rooms.get(number).sizeSquare+"м2 , гарантированно свободно : "+(rooms.get(number).numSquare-rooms.get(number).sizeSquare)+"м2);"+'\n';
        }
        System.out.println(out);
        return out;
    }
}
