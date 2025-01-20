// Assignment 9: Maximum Value Column-wise in a 2D Array
import java.util.Scanner;

public class MaxColumnWise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Maximum value column-wise:");
        for (int j = 0; j < cols; j++) {
            int max = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Column " + (j + 1) + ": " + max);
        }
    }
}
