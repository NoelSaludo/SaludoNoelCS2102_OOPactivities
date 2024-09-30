import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first chararcter: ");
        char chValue1 = scanner.next().charAt(0);
        System.out.print("Enter second character: ");
        char chValue2 = scanner.next().charAt(0);

        
        //Prints details
        String breakline = "--------------------------------------------------";
        String announce = "The character with greater value is: ";
        char greater = (int)chValue1 > (int)chValue2 ? chValue1 : chValue2; //tchecks which is greater
        System.out.print(breakline+'\n'+announce+greater+'\n'+breakline+'\n');
        System.out.println("Showing the ASCII Codes");
        System.out.println(chValue1+ " : "+(int)chValue1);
        System.out.println(chValue2+" : "+(int)chValue2);
        scanner.close();
    }
}
