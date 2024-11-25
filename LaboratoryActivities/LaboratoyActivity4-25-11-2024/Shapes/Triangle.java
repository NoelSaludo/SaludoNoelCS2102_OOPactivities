public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double semi = (a+b+c)/2;
        double result =  Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
        return result;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public void printShapeType() {
        System.out.println("Triangle");
    }
}