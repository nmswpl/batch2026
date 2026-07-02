package in.co.nmsworks.week3.day3;

public class MainMovieList {

    public static void main(String[] args) {
        MovieList movieList = new MovieList();

        movieList.readFile();
        movieList.yearWiseCount();
        movieList.yearWiseMoviesList();
    }
}
