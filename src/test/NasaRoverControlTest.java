package test;

import com.nasa.entities.*;
import com.nasa.enums.CardinalPoint;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public class NasaRoverControlTest {

    private Position maxPosition;
    private Position minPosition;
    private Plateau plateau;

    @Before
    public void setUp() {
        maxPosition = new NasaRoverPosition(5, 5, CardinalPoint.N);
        minPosition = new NasaRoverPosition(5, 5, CardinalPoint.N);
        plateau = new Plateau(minPosition, maxPosition);
    }

    @Test
    public void shouldRotateNasaRoverLeft() throws Exception {
        Position position = new NasaRoverPosition(1, 1, CardinalPoint.E);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "L", plateau);
        nasaRoverControl.explore();

        NasaRoverPosition nasaRoverPosition = (NasaRoverPosition) position;

        Assert.assertTrue(nasaRoverPosition.getCardinalPoint() == CardinalPoint.N);
    }

    @Test
    public void shouldRotateNasaRoverRight() throws Exception {
        Position position = new NasaRoverPosition(1, 1, CardinalPoint.E);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "R", plateau);
        nasaRoverControl.explore();

        NasaRoverPosition nasaRoverPosition = (NasaRoverPosition) position;

        Assert.assertTrue(nasaRoverPosition.getCardinalPoint() == CardinalPoint.S);
    }


    @Test
    public void shouldMoveEastOneGridPoint() throws Exception {
        Position position = new NasaRoverPosition(0, 0, CardinalPoint.E);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "M", plateau);
        nasaRoverControl.explore();

        Assert.assertEquals(rover.getPosition().getPositionX(), 1);
    }


    @Test
    public void shouldMoveWestOneGridPoint() throws Exception {
        Position position = new NasaRoverPosition(0, 0, CardinalPoint.W);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "M", plateau);
        nasaRoverControl.explore();

        Assert.assertEquals(rover.getPosition().getPositionX(), -1);
    }

    @Test
    public void shouldMoveNorthOneGridPoint() throws Exception {
        Position position = new NasaRoverPosition(0, 0, CardinalPoint.N);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "M", plateau);
        nasaRoverControl.explore();
        Assert.assertEquals(rover.getPosition().getPositionY(), 1);
    }

    @Test
    public void shouldMoveSouthOneGridPoint() throws Exception {
        Position position = new NasaRoverPosition(0, 0, CardinalPoint.S);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "M", plateau);
        nasaRoverControl.explore();
        Assert.assertEquals(rover.getPosition().getPositionY(), -1);
    }

    @Test
    public void shouldMoveOneRoverInPlateau() throws Exception {
        Position position = new NasaRoverPosition(1, 2, CardinalPoint.N);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "LMLMLMLMM", plateau);

        nasaRoverControl.explore();

        Assert.assertEquals(position.getCurrentPosition(), "1 3 N");


    }

    @Test
    public void shouldMoveAnotherRoverInPlateau() throws Exception {


        Position position = new NasaRoverPosition(3, 3, CardinalPoint.E);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "MMRMMRMRRM", plateau);
        nasaRoverControl.explore();

        Assert.assertEquals(position.getCurrentPosition(), "5 1 E");

    }


    @Test(expected = java.lang.Exception.class)
    public void shouldFailAndNotMoveAnotherRoverInPlateau() throws Exception {

        Position position = new NasaRoverPosition(3, 3, CardinalPoint.E);
        Rover rover = new NasaRover(position);

        RoverControl nasaRoverControl = new NasaRoverControl(rover, "MMXXRMMRMRRM", plateau);
        nasaRoverControl.explore();

        Assert.assertEquals(position.getCurrentPosition(), "5 1 E");

    }

}