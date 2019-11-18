import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;
    @Before
    public void before(){
        bottle = new Bottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void drink(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void empty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void full(){
        assertEquals(100, bottle.full());
    }
}
