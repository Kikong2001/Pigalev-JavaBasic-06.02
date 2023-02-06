package hillel.java.pigalev.basic.hw4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameGuess {
    public static void main(String[] args) {
        System.out.println("  Гра розпочалась: ");
        Scanner numberPlayer = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(0, 10);
        for (int i = 1; i < 4; i++) {
            System.out.print(i + " цифра: ");
            int number = numberPlayer.nextInt();
            if (number == randomNumber) {
                System.out.println("    Гравець вгадав!!!");
                break;
            } else if(i == 3){
                System.out.println("Гравець програв!!!");
            } else {
                System.out.println("Спробуйте ще");
            }
        }
    }
}
