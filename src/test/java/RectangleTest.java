import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void computeArea() {
        int height = 3, width = 4;
        int expectedArea = height * width;
        Rectangle rectangle = new Rectangle(height, width);
        assertEquals(expectedArea, rectangle.computeArea());
    }
}