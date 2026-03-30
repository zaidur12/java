import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MovieStore {
    public String movie;
    public int year;

    public MovieStore(String movie, int year) {
        this.movie = movie;
        this.year = year;
    }

    // Overriding toString so we can see the results clearly
    @Override
    public String toString() {
        return movie + " (" + year + ")";
    }
}

public class Comparee {
    public static void main(String[] args) {
        ArrayList<MovieStore> l = new ArrayList<>();
        l.add(new MovieStore("Star Wars", 1977));
        l.add(new MovieStore("Return of the Jedi", 1983));
        l.add(new MovieStore("Empire Strikes Back", 1980));

       
        l.sort((m1, m2) -> m1.movie.compareTo(m2.movie));

        

        System.out.println(l);
    }
}