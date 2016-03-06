package com.nasa.entities;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public abstract class Rover {
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    private Position position;


    public Rover(Position position)
    {
        this.position = position;
    }
}

