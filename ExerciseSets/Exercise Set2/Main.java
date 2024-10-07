

/* For Testing Purposes */
class Main {

    public static void main(String[] args) {
        /* Constructor */
        Car inova = new Car("Red", 190000.00, 'L');

        /* toString method */
        System.out.println(inova);

        /* Setters */
        inova.setColor("Green");
        inova.setPrice(200000.00);
        inova.setSize('M');
        System.out.println(inova);

        /* Getters */
        String color = inova.getColor();
        double price = inova.getPrice();
        char size = inova.getSize();
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
    }
}