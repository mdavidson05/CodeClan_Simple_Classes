
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class WaterBottleTests {

        //by declaring this variable we are "reserving" space in memory
        WaterBottle waterBottle;

        //same as before each
        @Before
        public void before(){
            waterBottle = new WaterBottle(100);

        }


        @Test
        public void drink(){
            assertEquals(90, waterBottle.drink(),0.0);
        }

        @Test
        public void fill(){
            assertEquals(100, waterBottle.fill(),0.0);
        }

        @Test
        public void empty(){
            assertEquals(0, waterBottle.empty(),0.0);
        }
}
