package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report{
    @Override
    String header() {
        return "Sales head";
    }

    @Override
    String body() {
        return "Sales body";
    }

    @Override
    String footer() {
        return "Sales footer";
    }

}
