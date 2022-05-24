import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void computeAreaNormal() {
        int height = 3, width = 4;
        int expectedArea = 12;
        Rectangle rectangle = new Rectangle(height, width);
        assertEquals(expectedArea, rectangle.computeArea());
    }

    @Test
    public void computeAreaNegHeight() {
        int height = -2, width = 4;
        try {
            Rectangle rectangle = new Rectangle(height, width);
            rectangle.computeArea();
            Assert.fail();
        }
        catch (NegativeArgException e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

    @Test
    public void computeAreaNegWidth() {
        int height = 1, width = -7;
        try {
            Rectangle rectangle = new Rectangle(height, width);
            rectangle.computeArea();
            Assert.fail();
        }
        catch (NegativeArgException e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

    @Test
    public void computeAreaBothNeg() {
        int height = -3, width = -6;
        try {
            Rectangle rectangle = new Rectangle(height, width);
            rectangle.computeArea();
            Assert.fail();
        }
        catch (NegativeArgException e) {
            System.out.println(e.getMessage());
            assertTrue(true);
        }
    }

//    @Test
//    public void computeAreaNonIntHeight() {
//        float height = 2.34F;
//        int width = 5;
//        try {
//            Rectangle rectangle = new Rectangle(height, width);
//            rectangle.computeArea();
//            Assert.fail();
//        }
//        catch (NonIntArgException e) {
//            assertTrue(true);
//        }
//    }
//
//    @Test
//    public void computeAreaNonIntWidth() {
//        int height = 4;
//        float width = 1.123F;
//        try {
//            Rectangle rectangle = new Rectangle(height, width);
//            rectangle.computeArea();
//            Assert.fail();
//        }
//        catch (NonIntArgException e) {
//            assertTrue(true);
//        }
//    }
//
//    @Test
//    public void computeAreaNonIntBoth() {
//        double height = -2.34;
//        float width = 6.5F;
//        try {
//            Rectangle rectangle = new Rectangle(height, width);
//            rectangle.computeArea();
//            Assert.fail();
//        }
//        catch (NonIntArgException e) {
//            assertTrue(true);
//        }
//    }
}