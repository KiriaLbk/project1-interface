package com.company;

import java.util.ArrayList;

public class Room implements Illumination,Employment
{
    String room;
    int numSquare;
    String describe;
    ArrayList<Bulb> bulbMas=new ArrayList<Bulb>();
    ArrayList<Furniture> furnMas=new ArrayList<Furniture>();
    int numWindows;
    int sizeIllumination;
    int sizeSquare;
    public Room(String room,int numSquare,int numWindows)
    {
        this.room=room;
        this.numSquare=numSquare;
        this.numWindows=numWindows;
        this.sizeIllumination=700*numWindows;
    }

    @Override
    public int addFitniture(Furniture furniture) {
        sizeSquare+=furniture.square;
        try {
            if (this.sizeSquare % this.numSquare > 70) {
                sizeSquare -= furniture.square;
                throw new WrongSpaceException("Площадь больше 70 % , невозможно добавить последний введенный вами предмет в "+ this.room);
            } else {
                furnMas.add(furniture);
            }
        }
        catch (WrongSpaceException exep)
        {
            System.out.println(exep.getMessage());
        }
        return sizeSquare;
    }

    @Override
    public int addIllum(Bulb bulb) throws Exception {
        sizeIllumination+=bulb.power;
         try {
             if (sizeIllumination > 4000) {
                 sizeIllumination -= bulb.power;
                 throw new WrongIlluminanceException("Освещенность комнаты больше 4000 лк , поэтому нельзя добавить последнюю введенную вами лампочку в "+ this.room);
             } else {
                 bulbMas.add(bulb);
             }
         }
        catch (WrongIlluminanceException ex)
        {
            System.out.println(ex.getMessage());
        }
        return sizeIllumination;
    }
}
