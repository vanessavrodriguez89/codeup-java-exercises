import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {


//    TODO Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    String[] adjectives = {"attractive", "elegant", "immense", "large", "agreeable", "clumsy", "itchy", "proud", "gentle", "plain"};

    String[] nouns = {"backbone", "clock", "skeleton", "pumpkin", "ghost", "witch", "candy", "costume", "tombstone", "demon"};

    System.out.println("Randomly Generated Name: " + randomElement(adjectives) + "-" + randomElement(nouns));
    }

//    TODO Create a method that will return a random element from an array of strings.
   public static String randomElement(String[] arr){
    Random rand = new Random();
    int rand_int = rand.nextInt(10);
    return arr[rand_int];
   }

//    TODO Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
}
