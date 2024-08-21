import java.util.Scanner;
/**
 * set1
 */
public class Welcome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to CS211: Object\nEnter your name: "); 
        String name = scanner.nextLine();
        System.out.println("This course will be fun, "+ name);
    } 
}