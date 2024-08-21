import java.util.Scanner;

/**
 * set2
 */
public class Escseq {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        if(num < 0) {
            System.out.println("Number must be positive!");
            System.exit(0);
        }
        for (int i = 1; i <= num; i++) {
            if(i % 2 == 0) {
                System.out.println("\t"+i*7);
            } else {
                System.out.println(i*7);
            }
        }
    }
}