package test;

import com.nasa.entities.NasaRover;
import com.nasa.entities.NasaRoverPosition;
import com.nasa.entities.Position;
import com.nasa.enums.CardinalPoint;
import junit.framework.Assert;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public class NasaRoverPositionTest {

    @org.junit.Test
    public void shouldGetCurrentPosition() throws Exception {

        Position position = new NasaRoverPosition(1, 1, CardinalPoint.E);
        Assert.assertEquals(position.getPositionX(), 1);
        Assert.assertEquals(position.getPositionY(), 1);

        NasaRoverPosition nasaRoverPosition = ((NasaRoverPosition)position);
        Assert.assertEquals(nasaRoverPosition.getCardinalPoint(), CardinalPoint.E);
        Assert.assertEquals(nasaRoverPosition.getCurrentPosition(), "1 1 E");
    }

    @org.junit.Test
    public void shouldGetCurrentPositionX() throws Exception {

        Position position = new NasaRoverPosition(1, 1, CardinalPoint.E);
        Assert.assertEquals(position.getPositionX(), 1);
    }

    @org.junit.Test
    public void shouldGetCurrentPositionY() throws Exception {

        Position position = new NasaRoverPosition(1, 1, CardinalPoint.E);
        Assert.assertEquals(position.getPositionY(), 1);
    }
    @org.junit.Test
    public void shouldGetCurrentCardinality() throws Exception {

        Position position = new NasaRoverPosition(1, 1, CardinalPoint.E);
        NasaRoverPosition nasaRoverPosition = ((NasaRoverPosition)position);
        Assert.assertEquals(nasaRoverPosition.getCardinalPoint(), CardinalPoint.E);
    }
}