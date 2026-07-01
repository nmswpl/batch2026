package in.co.nmsworks.training.week3.day3;

public class Movie {
    private String movieName;
    private Integer year;

    public Movie(String movieName, Integer year) {
        this.movieName = movieName;
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", year=" + year +
                '}';
    }

}
