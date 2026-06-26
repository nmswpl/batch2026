package in.co.nmsworks.training.week2.day3practices;

public class SalesReport extends Report {

    @Override
    String header() {
        return "Sales Head";
    }

    @Override
    String body() {
        return "Sales body";
    }

    @Override
    String footer() {
        return "Sales Footer";
    }

    @Override
    String generate() {
        return "Sales report "+super.generate();
    }
}
