package test;

import com.nasa.entities.Position;
import com.nasa.enums.CardinalPoint;
import junit.framework.Assert;

import static org.junit.Assert.*;

/**
 * Created by garthwhitaker on 2016/03/06.
 */
public class PositionTest {

    @org.junit.Test
    public void testShouldGetCurrentPosition() throws Exception {
        Position position = new Position(1,1, CardinalPoint.EAST);
       Assert.assertEquals(position.getPositionX(), 1);
       Assert.assertEquals(position.getPositionY(), 1);
       Assert.assertEquals(position.getCardinalPoint(), CardinalPoint.EAST);
       Assert.assertEquals(position.getCurrentPosition(),"Current Position is: (x,y,cardinality) : 1,1,EAST" );




    }
}