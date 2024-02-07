// Nazarii Goncharuk - 000367506 - CPRO 1221 - Assignment 2 - Project 5-1

import java.util.Scanner;

public class Main {
    static void dice() {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // randomize die numbers
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            int total = die1 + die2;
            System.out.println("Total: " + total);

            // check for snake eyes and boxcars
            if (total == 2) {
                System.out.println("Snake Eyes!");
            }
            if (total == 12) {
                System.out.println("Boxcars!");
            }

            // see if the user wants to continue
            System.out.print("Roll Again? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Program will now exit!");
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("Dice Roller\n");
        System.out.println("Roll the dice?:");
        Scanner sc = new Scanner(System.in);
        String choice1 = "y";
        choice1 = sc.nextLine();
        while (choice1.equalsIgnoreCase("y")) {
            dice();
        }
    }
}
