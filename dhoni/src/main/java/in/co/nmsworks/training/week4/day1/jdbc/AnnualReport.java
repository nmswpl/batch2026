package in.co.nmsworks.training.week4.day1.jdbc;

public class AnnualReport {
    private int year;
    private String industryCode;
    private String industryName;
    private String rmeSize;
    private String variable;
    private String value;
    private String unit;

    public AnnualReport(int year, String industryCode, String industryName, String rmeSize, String variable, String value, String unit) {
        this.year = year;
        this.industryCode = industryCode;
        this.industryName = industryName;
        this.rmeSize = rmeSize;
        this.variable = variable;
        this.value = value;
        this.unit = unit;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIndustryCode() {
        return industryCode;
    }

    public void setIndustryCode(String industryCode) {
        this.industryCode = industryCode;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
    }

    public String getRmeSize() {
        return rmeSize;
    }

    public void setRmeSize(String rmeSize) {
        this.rmeSize = rmeSize;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "AnnualReport{" +
                "year=" + year +
                ", industryCode='" + industryCode + '\'' +
                ", industryName='" + industryName + '\'' +
                ", rmeSize='" + rmeSize + '\'' +
                ", variable='" + variable + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
