package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report{
    @Override
    public String header(){

        return "\nSales Report";
    }

    @Override
    public String body() {
        return "\nthe body of the sales report";
    }

    @Override
    public String footer() {
        return "\nroot of the sales report";
    }

}
