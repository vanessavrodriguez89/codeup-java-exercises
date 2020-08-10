import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        TODO Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 2;
//        do {
//            System.out.println("i is " + i);
//            i += 2;
//
//        } while (i <= 100);

//        TODO Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println("i is " + i);
//            i -= 5;
//
//        } while (i >= -10);

//        TODO Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        long i = 2L;
//        do {
//            System.out.println("i is " + i);
//             i*=i;
//        } while (i <= 1000000);


//    TODO Refactor the previous two exercises to use a for loop instead.

//        long i;
//        for(i = 2L; i < 1000000; i*=i) {
//            System.out.println(i);
//            }

//       TODO Fizzbuzz

//        int i;
//        for (i = 0; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//        TODO Display a table of powers.
//        Scanner scanner = new Scanner(System.in);
//        String userResponse;
//            do {
//            System.out.print("Enter an integer here:");
//            int userInteger = scanner.nextInt();
//            System.out.println("Here is your table!\n" +
//                    "number | squared | cubed\n" +
//                    "------ | ------- | -----");
//            for (int i = 1; i <= userInteger; i++) {
//                int squared = (int) Math.pow(i, 2);
//                int cubed = (int) Math.pow(i, 3);
//                System.out.printf("%-6d | %-7d | %-5d%n", i, squared, cubed);
//            }
//            System.out.printf("\n\nWould you like to continue (y/n): ");
//            userResponse = scanner.next();
//
//        } while (userResponse.equals("y"));

//        TODO Convert given number grades into letter grades.
        Scanner scan = new Scanner(System.in);
        String userInput;
        do {
            System.out.print("Enter a numerical grade from 0 to 100:");
            int userInteger = scan.nextInt();
            if (userInteger >= 88 && userInteger <= 100){
                System.out.println("A : 100 - 88");
            } else if (userInteger >= 80 && userInteger <= 87){
                System.out.println("B : 87 - 80");
            } else if (userInteger >= 67 && userInteger <= 79){
                System.out.println("C : 79 - 67");
            } else if (userInteger >= 60 && userInteger <= 66){
                System.out.println("D : 66 - 60");
            } else {
                System.out.println("F : 59 - 0");
            }

            System.out.printf("\n\nWould you like to continue (y/n): ");
            userInput = scan.next();

        } while (userInput.equals("y"));





}
}


