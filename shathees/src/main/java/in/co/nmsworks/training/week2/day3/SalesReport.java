package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report {

    public String header(){
        return "Sales for November";
    }

    public String body(){
        return "peak movement of comapny";
    }

    public String footer(){
        return "note: good sales in november";
    }
}
