package in.co.nmsworks.training.week3.Day2;

public class ListPractice {
    String colors;

    public ListPractice(String colors) {
        this.colors = colors;
    }

    public String getColors() {
        return colors;
    }

    @Override
    public String toString() {
        return "ListPractice{" +
                "colors='" + colors + '\'' +
                '}';
    }
}
