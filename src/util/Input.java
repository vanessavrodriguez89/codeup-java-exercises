package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getString() {
        return scanner.next().toLowerCase();
    }
    public boolean yesNo() {
//        System.out.print("Do you want to continue inputting a number? ");
        String input = getString();
        if (input.equals("y") || input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int input;
        do {
            System.out.print("Please enter in an integer: ");
            input = getInt();
        } while (input < min || input > max);
        return input;
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(prompt);
        return input;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input;
        do {
            System.out.print("Please enter in a double value: ");
            input = getDouble();
        } while (input < min || input > max);
        return input;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        int input = Integer.parseInt(prompt);
        return input;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}