package in.co.nmsworks.training.week2.day3;

public class salesReport extends Report {
    @Override
    public String header() {
        return "Taramani Sales Report";
    }

    @Override
    public String body() {
        return "500 sales ";
    }

    @Override
    public String footer() {
        return "Makes 20% Profit";
    }
}
