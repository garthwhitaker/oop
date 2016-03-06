package com.nasa;

import com.nasa.entities.Position;
import com.nasa.enums.CardinalPoint;
import junit.framework.Assert;

public class Main {

    public static void main(String[] args) {
        Position position = new Position(1,1, CardinalPoint.EAST);
        System.out.println(position.getCurrentPosition());
    }
}
