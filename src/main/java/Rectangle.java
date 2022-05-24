public class Rectangle {
    private int height, width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int computeArea() throws RuntimeException {
        if (this.height < 0) {
            throw new NegativeArgException("Height of the rectangle cannot be negative.");
        }
        if (this.width < 0) {
            throw new NegativeArgException("Width of the rectangle cannot be negative.");
        }
        return this.height * this.width;
    }
}
