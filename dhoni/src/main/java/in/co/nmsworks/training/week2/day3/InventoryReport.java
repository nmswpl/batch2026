package in.co.nmsworks.training.week2.day3;


public class InventoryReport extends Report{
    private String typeReport;

    public InventoryReport(String typeReport) {
        this.typeReport = typeReport;
    }

    public String getTypeReport() {
        return typeReport;
    }

    public void setTypeReport(String typeReport) {
        this.typeReport = typeReport;
    }

    public void inventoryReport(){
        System.out.println(typeReport);
        super.generate();
    }
}