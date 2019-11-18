import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(150, 50);
    }
    @Test
    public void useSheets(){
        assertEquals(110, printer.useSheets(20, 2));
    }
    @Test
    public void useToner(){
        assertEquals(10, printer.useToner(20, 2));
    }
}
