import java.util.Scanner;

class GetArrayMean {
    public static void main(String[] args) {
        //initialize and declare variables 
        Scanner in = new Scanner(System.in);
        int[] arr;
        int sum = 0;
        int size;
        float avg;
        System.out.print("Enter number of element: ");
        size = in.nextInt();
        arr = new int[size];

        //takes input for the elements of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number: ");
            arr[i] = in.nextInt();    
        }
        
        //calculates the mean
        for (int i : arr) {
            sum += i;
        }
        avg  = ((float)sum / (float)size);
        System.out.printf("mean of the array is: %.2f", avg);
        System.out.println();
        in.close();
        
    }
}
