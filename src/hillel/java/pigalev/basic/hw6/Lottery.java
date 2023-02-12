package hillel.java.pigalev.basic.hw6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
         int length = 7;
         int alikeNumbers = 0;
         int [] firstTicket = new int [length];
         int [] secondTicket = new int [length];

        // Заполнение 1-го масива

        for (int i = 0; i < length ; i++) {
            firstTicket[i] = ThreadLocalRandom.current().nextInt(0, 10);
            }
        System.out.println("Білет Організатора лотереї: ");

        // Сортировка 1-го масива

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (firstTicket[j] > firstTicket[j + 1]) {
                    int number = firstTicket[j];
                    firstTicket[j] = firstTicket[j + 1];
                    firstTicket[j + 1] = number;
                }
            }
        }
        for (int k : firstTicket) {
            System.out.print(k + ", ");
        }
        System.out.println();

        // Заполнение 2-го масива

        System.out.println("Білет гравця: ");
        for (int j = 0; j < length; j++) {
            secondTicket [j] = ThreadLocalRandom.current().nextInt(0,9);
        }

        // Сортировка 2-го масива

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (secondTicket[j] > secondTicket[j + 1]) {
                    int number = secondTicket[j];
                    secondTicket[j] = secondTicket[j + 1];
                    secondTicket[j + 1] = number;
                }
            }
        }
        for (int b : secondTicket) {
            System.out.print(b + ", ");
        }
        System.out.println();

        // перевірка на збіжність чисел

        System.out.print("Збіглися: ");
        for (int i = 0; i < length; i++) {
            if (firstTicket[i] == secondTicket[i]) {
                alikeNumbers = alikeNumbers + 1;
                System.out.print(i + "й елемент, ");
            }
        }
        if (alikeNumbers == 0){
            System.out.print("Схожих Чисел немає!!!");
        }
        }
    }
