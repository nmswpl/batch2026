package in.co.nmsworks.training.week2.day3;

public class SalesReport extends Report{

    public String header(){
        return "Sales Report of Velachery Branch";
    }

    public String body(){
        return "Profit Percentage of June Month : 35%";
    }

    public String footer(){
        return "Total no of products sold in May-June : 15";
    }



}
