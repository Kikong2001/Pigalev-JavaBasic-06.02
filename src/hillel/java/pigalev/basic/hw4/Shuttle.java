package hillel.java.pigalev.basic.hw4;

public class Shuttle {
    public static void main(String[] args) {
        System.out.println("Номери шатлів:");
        int shuttleCounter = 0;
        for (int i = 1; shuttleCounter < 100; i++) {
            int units = i % 10;
            if(units == 4 || units == 9) {
                continue;
            }
            int tens = i / 10 % 10;
            if (tens == 4 || tens == 9) {
                continue;
            }
            System.out.println("Шатл: " + i);
            shuttleCounter++;




        }

    }
}
