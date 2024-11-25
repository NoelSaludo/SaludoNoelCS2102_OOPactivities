public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimeter() {
        return (2*length)+(2*width);
    }

    @Override
    public void printShapeType() {
        System.out.println("Rectangle");
    }
}
