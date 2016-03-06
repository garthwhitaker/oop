package com.nasa.entities;

import com.nasa.enums.CardinalPoint;

public class NasaRoverPosition extends  Position{


    public CardinalPoint getCardinalPoint() {
        return cardinalPoint;
    }

    public void setCardinalPoint(CardinalPoint cardinalPoint) {
        this.cardinalPoint = cardinalPoint;
    }


    private CardinalPoint cardinalPoint;


    public NasaRoverPosition(int positionX, int positionY, CardinalPoint cardinalPoint)
    {
        super(positionX,positionY);

        this.cardinalPoint = cardinalPoint;
    }

    public String getCurrentPosition()
    {
        return super.getPositionX()+ " " + super.getPositionY() + " " + cardinalPoint.name();
    }

}
