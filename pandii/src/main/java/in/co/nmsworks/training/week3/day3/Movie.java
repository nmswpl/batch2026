package in.co.nmsworks.training.week3.day3;

public class Movie {
    private Integer releaseYear;
    private String movieName;

    public Movie() {
    }

    public Movie(Integer releaseYear, String movieName) {
        this.releaseYear = releaseYear;
        this.movieName = movieName;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "releaseYear=" + releaseYear +
                ", movieName='" + movieName + '\'' +
                '}';
    }
}
