package be.intecbrussel.diceroller;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {


    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    private int input;
    int[] timesPerFace = new int[6];

    public static void main(String[] args) {

        new DiceRoller();
    }

    public DiceRoller() {

        askNumber();
        rollDice();
        printResults();
    }

    public void askNumber() {

        System.out.println("How many times do you want the dice to be rolled? (min. 20)");

        while (true) {
            input = scanner.nextInt();

            if (input < 20) {
                System.out.println("The input should be at least 20.");
            }
            else {
                break;
            }
        }
    }

    public void rollDice() {

        for (int i = 0; i < input; i++) {

            int face = random.nextInt(6);
            timesPerFace[face]++;
        }
    }

    public void printResults() {

        System.out.printf("The dice was rolled %d times. %n%n" +
                "The dice landed : %n", input);

        for (int i = 0; i < timesPerFace.length; i++) {

            System.out.printf("* %d times on %d (%.2f %%)%n",
                    timesPerFace[i],
                    i + 1,
                    100 * (float) timesPerFace[i]/input);
        }
    }
}
