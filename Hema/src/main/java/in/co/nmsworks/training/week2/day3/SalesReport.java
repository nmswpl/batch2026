package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report{

    @Override
    public String header() {
        return "Sales Report's => Header ";
    }

    @Override
    public String body() {
        return "Sales Report's => Body ";
    }

    @Override
    public String footer() {
        return "Sales Report's => Footer";
    }
//
//    @Override
//    public String generate() {
//        return "For SalesReport => "+super.generate();
//    }
}
