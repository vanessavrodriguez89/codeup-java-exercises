import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int random_number = (int)(Math.random() * (max - min + 1) + min);
//            System.out.println(random_number);
        do {
            System.out.print("Guess a number between 1 and 100: ");
            int userInteger = scan.nextInt();
            if (userInteger > random_number){
                System.out.println("LOWER");
            } else if (userInteger < random_number){
                System.out.println("HIGHER");
            } else {
                System.out.println("GOOD GUESS!");
                break;
            }

        } while (true);
    }

}
