import java.util.ArrayList;
import java.util.Collections;

class moviestore implements Comparable<moviestore> {
    public String movie;
    public int year;

    public moviestore(String movie, int year) {
        this.movie = movie;
        this.year = year;
    }

    @Override
    public int compareTo(moviestore other) {
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return movie + " (" + year + ")";
    }
}

public class compare {
    public static void main(String[] args) {
        moviestore m1 = new moviestore("Star Wars", 1977);
        moviestore m2 = new moviestore("Empire Strikes Back", 1980);
        moviestore m3 = new moviestore("Return of the Jedi", 1983);

        ArrayList<moviestore> l = new ArrayList<>();
        l.add(m1);
        l.add(m2);
        l.add(m3);

        Collections.sort(l);

        for (moviestore movie : l) {
            System.out.println(movie);
        }
    }
}
