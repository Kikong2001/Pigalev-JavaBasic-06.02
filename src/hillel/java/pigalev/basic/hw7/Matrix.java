package hillel.java.pigalev.basic.hw7;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {
    public static void main(String[] args) {
        Scanner sizeMatrix = new Scanner(System.in);
        System.out.print("Стодбці: ");
        int sizeM = sizeMatrix.nextInt();
        System.out.print("Строки: ");
        int sizeN = sizeMatrix.nextInt();
        int[][] firstMatrix = new int[sizeN][sizeM];
        int[][] secondMatrix = new int[sizeM][sizeN];
        fillMatrixWithRandomValues(firstMatrix);
        System.out.println("Матиринська матриця: ");
        printMatrix(firstMatrix);
        System.out.println("Транспонована матриця: ");
        swapRowsAndColumnsInMatrix(firstMatrix, secondMatrix);
        printMatrix(secondMatrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void fillMatrixWithRandomValues(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
            }
        }
    }

    public static void swapRowsAndColumnsInMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < firstMatrix.length; j++) {
                secondMatrix[i][j] = firstMatrix[j][i];
            }
        }
    }
}


