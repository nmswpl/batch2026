package in.co.nmsworks.training.week3.day5;

public class Cards {
    private Character suite;
    private Integer number;

    public Cards(Character suite, Integer number) {
        this.suite = suite;
        this.number = number;
    }

    public Character getSuite() {
        return suite;
    }

    public void setSuite(Character suite) {
        this.suite = suite;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "suite=" + suite +
                ", number=" + number +
                '}';
    }
}
