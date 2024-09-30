import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        //initialize
        Scanner in = new Scanner(System.in);
        int[][] matrix;
        int size;
        System.out.print("Enter the maximum number of the multiplication table: ");
        size = in.nextInt();

        //populate matrix
        matrix = new int[size][size];
        for (int i = 1; i <= size; i++) {
            matrix[i-1][0] = i;
            for (int j = 1; j <= size; j++) {
                matrix[i-1][j-1] = i * j;
            }
        }

        for (int[] is : matrix) {
            for (int i = 0; i < size; i++) {
                System.out.printf("%4d", is[i]);
            }
            System.err.println();
        }

        in.close();
    }
}
