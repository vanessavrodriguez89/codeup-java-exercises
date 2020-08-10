import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + "%.2f", pi);

//      TODO 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter an integer:");
        int userInput = scanner.nextInt();
        System.out.println("\nYou entered: --> " + userInput + " <--");

//      TODO 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\nPlease enter 3 words: ");
        String str0 = scan.next();
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(String.format("str0: %s str1: %s str2: %s\n",str0, str1, str2));

//      TODO 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
        Scanner scanString = new Scanner(System.in);
        System.out.print("\n\nPlease enter a sentence: ");
        String sentence = scanString.nextLine();
        System.out.println("\nYou entered: --> " + sentence + " <--");

//      TODO Prompt the user to enter values of length and width of a classroom at Codeup.
        Scanner perimeterArea = new Scanner(System.in);
        System.out.print("\n\nPlease enter the length: ");
        String sLength = perimeterArea.nextLine();
        System.out.print("\nPlease enter the width: ");
        String sWidth = perimeterArea.nextLine();
        int length = Integer.parseInt(sLength);
        int width = Integer.parseInt(sWidth);
        System.out.println("\nThe perimeter of your classroom is: --> " + ((2*width)+(2*length)) + " <--\nThe area of your classroom is: --> " + (length*width) + " <--" );
    }
}
