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

        // Заповненя матриці

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                firstMatrix[i][j] = ThreadLocalRandom.current().nextInt(0, 10);
            }
        }

        System.out.println();

        // вивід матриці

        for (int[] row : firstMatrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();

        // Переініцалізація

        for (int i = 0; i < sizeM; i++) {
            for (int j = 0; j < sizeN; j++) {
                secondMatrix[i][j] = firstMatrix[j][i];
            }
        }

        // вивід матриці

        for (int[] row : secondMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
