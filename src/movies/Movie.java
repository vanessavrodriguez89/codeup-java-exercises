package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {

        return category;
    }

    public static void getCategory(String genre){
        for (Movie movie : MoviesArray.findAll()) {
            if(movie.getCategory().equals(genre)) {
                System.out.println(movie.getName());
            }
        }
        System.out.println();
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
