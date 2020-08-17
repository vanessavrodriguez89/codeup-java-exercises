package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movieList = MoviesArray.findAll();
        Input scan = new Input();

        int choice;
        do {
        System.out.println("What would you like to do? (Enter Number) ");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println("6 - Search for a Title\n");
        System.out.print("Enter your numbered choice: ");
        choice = scan.getInt();

            switch (choice) {
                case 0:
                    System.out.println("Goodbye");
                    break;
                case 1:
                    for (Movie movie : movieList) {
                        System.out.println(movie.getName());
                    }
                    System.out.println();
                    break;

                case 2:
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println();
                    break;
                case 3:
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    for (Movie movie : movieList) {
                        if(movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    System.out.println("What is the title of the movie you are searching for? ");
                    String entry = scan.getString();
                    System.out.println();
                    for (Movie movie : movieList) {
                        if(movie.getName().contains(entry)) {
                            System.out.println(movie.getName());
                        }
                    }
                    System.out.println();
                    break;
            }

        } while (scan.yesNo());
    }
}
