package com.nasa.entities;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public class Plateau {


    private Position maxPosition;
    private Position minPosition;

    public Plateau(Position minPosition, Position maxPosition) {
        this.minPosition = minPosition;
        this.maxPosition = maxPosition;
    }

    public boolean canMove()
    {
return true;
     //   if(maxPosition.getPositionX())
    }


}
