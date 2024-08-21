
import java.util.Scanner;



/**
 * set3
 */
public class Tempconvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a celsuis degrees: ");
        float celsuis = scanner.nextFloat();
        float farenheit = (celsuis * 9)/5 + 32;
        String output = String.format("%.2f Celsius is %.2f in Farenheit", celsuis, farenheit);
        System.out.println(output);
    } 
}