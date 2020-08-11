import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner bobScan = new Scanner(System.in);
        System.out.print("Hello. Would you like to chat?");
            String bobInput = bobScan.nextLine();
            while (true){

            if (bobInput.endsWith("?")){
                System.out.println("Sure.");
            } else if (bobInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            } else if (bobInput.equals("")){
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
                System.out.println("\nWhat about now? ");
                bobInput = bobScan.nextLine();
            }

    }
}
