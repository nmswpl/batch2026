package in.co.nmsworks.training.week3.Day3;

import java.util.Objects;

public class MovieData {
    private String name;
    private Integer year;

    public MovieData(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public MovieData() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MovieData movieData = (MovieData) o;
        return Objects.equals(name, movieData.name) && Objects.equals(year, movieData.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

    @Override
    public String toString() {
        return "MovieData{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
