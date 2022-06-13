import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {


    //by declaring this variable we are "reserving" space in memory
    Printer printer;

    //same as before each
    @Before
    public void before() {
        printer = new Printer(100, 20, 3, 10);

    }


    @Test
    public void checkSheetsAvailable() {
        assertEquals(100, printer.checkNumberOfSheetsLeft(), 0.0);
    }

    @Test
    public void checkEnoughPagesToPrint() {
        assertEquals( true, printer.checkEnoughPagesToPrint());
    }

    @Test
    public void checkNotEnoughPagesToPrint() {
        printer = new Printer(100, 20, 6, 10);

        assertEquals( false, printer.checkEnoughPagesToPrint());
    }

    @Test
    public void setPages() {
        printer = new Printer(100, 0, 0, 10);
        printer.addPages(20);
        assertEquals(20, printer.checkPages());
    }

    @Test
    public void setCopies() {
        printer = new Printer(100, 0, 0, 10);
        printer.addCopies(3);
        assertEquals(3, printer.checkCopies());
    }

    @Test
    public void printAndReduce() {
        printer = new Printer(100, 20, 3, 10);
        printer.reduce();
        assertEquals(40, printer.checkNumberOfSheetsLeft());

    }

    @Test
    public void checkTonerVolume() {
        printer = new Printer(100, 20, 3, 10);
        printer.reduce();
        assertEquals(9, printer.tonerVolume());

    }




}
