package in.co.nmsworks.training.week2.day3;


public class SalesReport extends Report{
    private String typeReport;

    public String getTypeReport() {
        return typeReport;
    }

    public void setTypeReport(String typeReport) {
        this.typeReport = typeReport;
    }

    public void salesReport(){
        System.out.println(typeReport);
        super.generate();
    }

    public SalesReport(String typeReport) {
        this.typeReport = typeReport;
    }
}
