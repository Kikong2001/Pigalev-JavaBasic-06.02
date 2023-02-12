package hillel.java.pigalev.basic.hw7;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sizeMatrix = new Scanner(System.in);
        System.out.print("Стодбці: ");
        int sizeM = sizeMatrix.nextInt();
        System.out.print("Строки: ");
        int sizeN = sizeMatrix.nextInt();
        int[][] firstMatrix = new int[sizeM][sizeN];
        int[][] secondMatrix = new int[sizeN][sizeM];
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length ; j++) {
                System.out.print(firstMatrix[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < secondMatrix.length ; i++) {
            for (int j = 0; j <secondMatrix[i].length ; j++) {
                System.out.print(secondMatrix[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
