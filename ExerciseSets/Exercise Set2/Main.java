

/* For Testing Purposes */
class Main {

    public static void main(String[] args) {
        /* Constructor */
        Car innova = new Car("Red", 190000.001, 'L');

        /* toString method */
        System.out.println(innova);

        /* Setters */
        innova.setColor("Green");
        innova.setPrice(200000.00);
        innova.setSize('M');
        System.out.println(innova);

        /* Getters */
        String color = innova.getColor();
        double price = innova.getPrice();
        char size = innova.getSize();
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
    }
}