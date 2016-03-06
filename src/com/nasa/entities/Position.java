package com.nasa.entities;

import com.nasa.enums.CardinalPoint;

public class Position {
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

    public CardinalPoint getCardinalPoint() {
        return cardinalPoint;
    }

    public void setCardinalPoint(CardinalPoint cardinalPoint) {
        this.cardinalPoint = cardinalPoint;
    }

    private int positionX;
    private int positionY;
    private CardinalPoint cardinalPoint;

    public Position()
    {}

    public Position(int positionX, int positionY, CardinalPoint cardinalPoint)
    {
        this.positionX = positionX;
        this.positionY = positionY;
        this.cardinalPoint = cardinalPoint;
    }

    public String getCurrentPosition()
    {
        return "Current Position is: (x,y,cardinality) : " + positionX + "," + positionY + "," + cardinalPoint.name();

    }
}
