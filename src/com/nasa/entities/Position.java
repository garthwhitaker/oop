package com.nasa.entities;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public abstract class Position {
    private int positionX;
    private int positionY;
    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Position(int positionX, int positionY)
    {
        this.positionX = positionX;
        this.positionY = positionY;
    }

     public String getCurrentPosition(){
         return String.valueOf(this.positionX);
     }
}
