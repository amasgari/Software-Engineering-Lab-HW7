import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void getSideMethodTest() {
        int side = 1;
        Square square = new Square(side);
        assertEquals(1, square.GetSide());
    }

    @Test
    public void setSideMethodTest() {
        int side = 1;
        Square square = new Square(side);
        square.SetSide(2);
        assertEquals(2, square.GetSide());
    }

    @Test
    public void computeAreaNormal() {
        int side = 2;
        int expectedArea = 4;
        Square square = new Square(side);
        assertEquals(expectedArea, square.computeArea());
    }

    @Test
    public void computeAreaNegSide() {
        int side = 2;
        try {
            Square square = new Square(side);
            square.computeArea();
            Assert.fail();
        }
        catch (NegativeArgException e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

}
