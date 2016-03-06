package com.nasa.entities;

import com.nasa.constants.Constants;
import com.nasa.enums.CardinalPoint;

public class NasaRoverControl implements RoverControl {

    public Plateau getPlateau() {
        return plateau;
    }

    public void setPlateau(Plateau plateau) {
        this.plateau = plateau;
    }

    private Plateau plateau;

    public Rover getNasaRover() {
        return nasaRover;
    }

    private Rover nasaRover;
    private String navigationInstructions;

    public NasaRoverControl(Rover nasaRover, String navigationInstructions, Plateau plateau) {
        this.nasaRover = nasaRover;
        this.navigationInstructions = navigationInstructions;
        this.plateau = plateau;
    }

    public void explore() throws Exception {

        for (int i = 0; i < navigationInstructions.length(); i++) {

            char instruction = navigationInstructions.charAt(i);

            if (instruction == Constants.LEFT) {
                rotateLeft();
            }
            else if(instruction == Constants.RIGHT)
            {
                rotateRight();
            }
            else if (instruction == Constants.MOVE){
                move();
            }
            else
            {
                throw new Exception("Invalid instruction: " + String.valueOf(instruction) + ", expected L/R/M");
            }

        }

    }

    @Override
    public void rotateLeft() {

        //90 degress from current cardinality
        //i.e. so if facing north 90 degrees after rotate left then face west cardinality
        NasaRoverPosition currentPosition = (NasaRoverPosition)this.nasaRover.getPosition();

        if (currentPosition.getCardinalPoint().equals(CardinalPoint.E)) {
            currentPosition.setCardinalPoint(CardinalPoint.N);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.W)) {
            currentPosition.setCardinalPoint(CardinalPoint.S);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.N)) {
            currentPosition.setCardinalPoint(CardinalPoint.W);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.S)) {
            currentPosition.setCardinalPoint(CardinalPoint.E);
        }
        System.out.println(currentPosition.getCurrentPosition());
    }

    @Override
    public void rotateRight() {

        //90 degrees from current cardinality
        //i.e. so if facing north 90 degrees after rotate right then face east cardinality

        NasaRoverPosition currentPosition = (NasaRoverPosition)this.nasaRover.getPosition();

        if (currentPosition.getCardinalPoint().equals(CardinalPoint.E)) {
            currentPosition.setCardinalPoint(CardinalPoint.S);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.W)) {
            currentPosition.setCardinalPoint(CardinalPoint.N);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.N)) {
            currentPosition.setCardinalPoint(CardinalPoint.E);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.S)) {
            currentPosition.setCardinalPoint(CardinalPoint.W);
        }

    }

    @Override
    public void move() {

        //Current positin be it either X or Y will be incremented or decremented by 1 based on cardinality
        NasaRoverPosition currentPosition = (NasaRoverPosition)this.nasaRover.getPosition();

        if (currentPosition.getCardinalPoint().equals(CardinalPoint.E) ) {
            int currentPositionX = currentPosition.getPositionX();
            currentPosition.setPositionX(currentPosition.getPositionX() + 1);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.W) ) {
            int currentPositionX = currentPosition.getPositionX();
            currentPosition.setPositionX(currentPosition.getPositionX() - 1);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.N)) {
            int currentPositionY = currentPosition.getPositionY();
            currentPosition.setPositionY(currentPosition.getPositionY() + 1);
        } else if (currentPosition.getCardinalPoint().equals(CardinalPoint.S)) {
            int currentPositionY = currentPosition.getPositionY();

            currentPosition.setPositionY(currentPosition.getPositionY() - 1);
        }

    }
}
