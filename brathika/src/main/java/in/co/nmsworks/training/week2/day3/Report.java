package in.co.nmsworks.training.week2.day3;

public class Report {
    public String header() {
        return "";
    }
    public String body() {
        return "";

    }
    public String footer() {
        return "";
    }
    public String generate() {
        return header()+" "+body()+" "+footer();
    }
}
class SalesReport extends Report {
    @Override
    public String header() {
        return "Report od month June";
    }

    @Override
    public String body() {
        return "Good Sales";
    }

    @Override
    public String footer() {
        return "Sales per cent was 55 per cent";
    }

}
class InventoryReport extends Report {
    @Override
    public String header() {
        return "Inventory report of the month";
    }

    @Override
    public String body() {
        return "45 per cent of vehicles are left";
    }

    @Override
    public String footer() {
        return "50 cars were ordered";
    }
}

