//package util;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Input {
//    Scanner scanner;
//
//    // constructor returns an Input object
//    public Input() {
//        scanner = new Scanner(System.in).useDelimiter("\n");
//    }
//
//    public boolean yesNo() {
//        String input = getString();
//        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");
//    }
//
//    public boolean yesNo(String prompt) {
//        System.out.println(prompt);
//        return yesNo();
//    }
//
//    public int getInt() {
//        // we need to gracefully handle exceptions
//        String userInput;
//
//        try {
//            // get input from the user
//            // parse the input string as an integer
//            // if valid, return the input
//            userInput = scanner.next();
//            return Integer.valueOf(userInput);
//
//        } catch (Exception e) {
//            // catch runs if the "try" code throws an exception
//            System.out.println("Please make sure your input is a valid integer using numerals");
//            return getInt();
//        }
//
//    }
//
//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return getInt();
//    }
//
//    public int getInt(int min, int max) {
//        int userInt = getInt();
//        if(userInt >= min && userInt <= max) {
//            return userInt;
//        } else {
//            System.out.println("The integer must be between " + min + " and " + max);
//            return getInt(min, max);
//        }
//    }
//
//    public int getInt(int min, int max, String prompt) {
//        System.out.println(prompt);
//        return getInt(min, max);
//    }
//
//    public String getString() {
//        return scanner.next();
//    }
//
//    public String getString(String prompt) {
//        System.out.println(prompt);
//        return getString();
//    }
//
//    public double getDouble() {
//        String userInput;
//
//        try {
//            userInput = scanner.next();
//            return Double.valueOf(userInput);
//
//        } catch (Exception e) {
//            System.out.println("Please input a valid double");
//            return getDouble();
//        }
//    }
//
//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        return getDouble();
//    }
//
//    public double getDouble(double min, double max) {
//        double userDouble = getDouble();
//        if(userDouble >= min && userDouble <= max) {
//            return userDouble;
//        } else {
//            System.out.println("The double must be between " + min + " and " + max);
//            return getDouble(min, max);
//        }
//    }
//
//    public double getDouble(double min, double max, String prompt) {
//        System.out.println(prompt);
//        return getDouble(min, max);
//    }
//}

package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;
    // Default Constructor
    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getString() {
        return scanner.next().toLowerCase();
    }
    public boolean yesNo() {
        System.out.print("Do you want to continue inputting a number? ");
        String input = getString();
        if (input.equals("y") || input.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }
    // Get the user's input
    public int getInt(int min, int max) {
        int input;
        do {
            System.out.print("Please enter in an integer: ");
            input = getInt();
        } while (input < min || input > max);
        return input;
    }
    // Overloading above method
    // Get the user's input with the option String parameter "prompt"
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