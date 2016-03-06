package com.nasa;

import com.nasa.entities.*;
import com.nasa.enums.CardinalPoint;

public class Main {

    public static void main(String[] args) throws Exception {
        Position position = new NasaRoverPosition(1,2, CardinalPoint.N);
        Rover rover = new NasaRover(position);
        Position maxPosition = new NasaRoverPosition(5, 5, CardinalPoint.N);
        Position  minPosition = new NasaRoverPosition(5, 5, CardinalPoint.N);
        Plateau plateau = new Plateau(minPosition, maxPosition);
        NasaRoverControl nasaRoverControl = new NasaRoverControl(rover,"LMLMLMLMM",plateau);
        nasaRoverControl.explore();
        NasaRoverPosition nasaRoverPosition = (NasaRoverPosition)nasaRoverControl.getNasaRover().getPosition();

        System.out.println(nasaRoverPosition.getCurrentPosition());

    }
}
