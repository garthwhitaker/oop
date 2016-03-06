package com.nasa.entities;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public class Plateau {


    public Position getMaxPosition() {
        return maxPosition;
    }

    public void setMaxPosition(Position maxPosition) {
        this.maxPosition = maxPosition;
    }

    public Position getMinPosition() {
        return minPosition;
    }

    public void setMinPosition(Position minPosition) {
        this.minPosition = minPosition;
    }

    private Position maxPosition;
    private Position minPosition;

    public Plateau(Position minPosition, Position maxPosition) {
        this.minPosition = minPosition;
        this.maxPosition = maxPosition;
    }

}
