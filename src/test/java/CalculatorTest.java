import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(3, 2);
    }

    @Test
    public void addition(){
        assertEquals(5, calculator.add());
    }

    @Test
    public void subtract(){
        assertEquals(1, calculator.subtract());
    }

    @Test
    public void multiply(){
        assertEquals(6, calculator.multiply());
    }

    @Test
    public void divide(){
        assertEquals(1.5, calculator.divide(), 0.1);
    }

}
