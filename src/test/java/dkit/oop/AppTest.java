package dkit.oop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testCircleArea()
    {
        Circle c1 = new Circle(4,5,2);
        double expected = Math.PI*2*2; // PI x radius squared
        double actual = c1.area();
        assertEquals( expected, actual, 0.01 );
    }
}
