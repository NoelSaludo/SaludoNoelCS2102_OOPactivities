public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public void printShapeType() {
        System.out.println("Square");
    }
}
