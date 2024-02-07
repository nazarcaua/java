// Nazarii Goncharuk - 000367506 - CPRO 1221 - Assignment 2 - Project 5-2

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Area and Perimeter Calculator\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            double length = getDouble(sc, "Enter Length: ", 0.0, 1000000.0);
            double width = getDouble(sc, "Enter Width: ", 0.0, 1000000.0);
            double area = length * width;
            double perimeter = 2 * length + 2 * width;
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            choice = getChoice(sc, "Would you like to re-enter your values? (y/n): ");
            System.out.println();
        }
        System.out.println("Bye!");
        System.exit(0);
    }

    // string checking method
    public static String getChoice(Scanner sc, String prompt) {
        String number;
        while (true) {
            System.out.print(prompt);
            number = sc.nextLine();
            if (number.equalsIgnoreCase("y") || number.equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
            }
        }
        return number;
    }

// double checking method
    public static double getDouble(Scanner sc, String prompt, double min, double max) {
        double number;
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            try {
                number = Double.parseDouble(input);
                if (number < min) {
                    throw new IllegalArgumentException("Number must be greater than " + min);
                } else if (number > max) {
                    throw new IllegalArgumentException("Number must be less than " + max);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal value. Try again.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error! " + e.getMessage());
            }
        }
        return number;
    }
}
