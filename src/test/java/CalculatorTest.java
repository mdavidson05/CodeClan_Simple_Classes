import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    //by declaring this variable we are "reserving" space in memory
    Calculator calculator;

    //same as before each
    @Before
    public void before(){
        calculator = new Calculator(29.45, 17.55);

    }


    @Test
    public void add(){
        assertEquals(47, calculator.add(),0.0);
    }

    @Test
    public void subtract() {
        assertEquals(11.899999999999999,calculator.subtract(), 0.0);
    }
    @Test
    public void multiply() {
        assertEquals(516.8475, calculator.multiply(), 0.0);
    }
    @Test
    public void divide() {

        assertEquals(1.678062678062678, calculator.divide(), 0.0);
    }
}
