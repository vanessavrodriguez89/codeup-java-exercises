import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Add(4, 2)); //6
//        System.out.println(Subtract(10, 5)); //5
//        System.out.println(Multiply(24, 3)); //8
//        System.out.println(Divide(100, 10)); //10
//        System.out.println(Divide(2, 0)); // "Cannot divide by 0"
//        System.out.println(Remainder(10, 3)); //1
//        int userInput = getInteger(10, 20));
//        factorial();
//        System.out.println(factorialUsingForLoop(5));

    }

    public static int Add(int num1, int num2) {
        return num1 + num2;
    }

    public static int Subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static Serializable Divide(int num1, int num2) {
        String error = "Cannot Divide by Zero";
        if (num2 == 0) {
            return error;
        }
        return num1 / num2;
    }

    public static int Remainder(int num1, int num2) {
        return num1 % num2;
    }

    // TODO Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ": ");
        int userInteger = scan.nextInt();
          if (userInteger < min || userInteger > max) {
            System.out.println(userInteger + " was not between " + min + " and " + max + ".");
              userInteger = getInteger(min, max);
            }
        return userInteger;
    }

//    TODO Calculate the factorial of a number
    public static void factorial(){
        Scanner factorialScan = new Scanner(System.in);
            System.out.print("Please enter a number between 1 and 10: ");
            int userInteger = factorialScan.nextInt();
            if (userInteger < 1 || userInteger > 10) {
                System.out.println(userInteger + " was not between 1 and 10.");
                factorial();
            } else {
                long fact = 1;
                for (int i = 2; i <= userInteger; i++) {
                    fact *= i;
                }
                System.out.println("The factorial of " + userInteger + " is: " + fact);
            System.out.print("Would you like to enter another number? y/n: ");
            String userResponse = factorialScan.next();
            if (userResponse.equalsIgnoreCase("y")) {
                factorial();
            }
            }
    }

//    TODO Create an application that simulates dice rolling.
//    public static void diceRoll(){
//        Scanner diceScan = new Scanner(System.in);
//        System.out.print("Enter the number of sides for a pair of dice: ");
//        int sidesToRoll = diceScan.nextInt();
//
//        System.out.print("\nReady to roll? y/n");
//        String readyToRoll = diceScan.nextLine();
//
//        if (readyToRoll.equalsIgnoreCase("y")){
//            Random numb = new Random();
//
//        }
//
//    }


//    TODO GAME DEVELOPMENT 101











// end of class MethodsExercises
}