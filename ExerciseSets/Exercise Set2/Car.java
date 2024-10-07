
public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = size == 'L' ? 'L' : size == 'M' ? 'M' : size == 'S' ? 'S' : ' ';
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public char getSize() {
        return size;
    }
    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    @Override
    public String toString() {
        String sizeVal = size == 'L' ? "large" : size == 'M' ? "medium" : size == 'S' ? "small" : "N/A";
        String val = "Car (" + color + ") - P" + String.format("%.2f",price) + " - " + sizeVal;
        return val;
    }
}
