package in.co.nmsworks.training.week4.day1;

public class EnterpriseSurvey {
    private Integer year;
    private String industryCode;
    private String industryName;
    private String rmeSizeGroup;
    private String variable;
    private Long value;
    private String unit;

    public EnterpriseSurvey(Integer year, String industryCode, String industryName, String rmeSizeGroup, String variable, Long value, String unit) {
        this.year = year;
        this.industryCode = industryCode;
        this.industryName = industryName;
        this.rmeSizeGroup = rmeSizeGroup;
        this.variable = variable;
        this.value = value;
        this.unit = unit;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
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

    public String getRmeSizeGroup() {
        return rmeSizeGroup;
    }

    public void setRmeSizeGroup(String rmeSizeGroup) {
        this.rmeSizeGroup = rmeSizeGroup;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
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
        return "EnterpriseSurvey{" +
                "year=" + year +
                ", industryCode='" + industryCode + '\'' +
                ", industryName='" + industryName + '\'' +
                ", rmeSizeGroup='" + rmeSizeGroup + '\'' +
                ", variable='" + variable + '\'' +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
