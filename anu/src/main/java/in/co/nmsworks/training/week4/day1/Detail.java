package in.co.nmsworks.training.week4.day1;

public class Detail {
    private int year;
    private String industryCodeAnzsic;
    private String industryNameAnzsic;
    private String rme_size_grp;
    private String variable;
    private String value;
    private String unit;

    public String getUnit() {
        return unit;
    }

    public Detail(int year, String industry_code_ANZSIC, String industry_name_ANZSIC, String rme_size_grp, String variable, String value, String unit) {
        this.year = year;
        this.industryCodeAnzsic = industry_code_ANZSIC;
        this.industryNameAnzsic = industry_name_ANZSIC;
        this.rme_size_grp = rme_size_grp;
        this.variable = variable;
        this.value = value;
        this.unit = unit;
    }

    public int getYear() {
        return year;
    }

    public String getIndustryCodeAnzsic() {
        return industryCodeAnzsic;
    }

    public String getIndustryNameAnzsic() {
        return industryNameAnzsic;
    }

    public String getRme_size_grp() {
        return rme_size_grp;
    }

    public String getVariable() {
        return variable;
    }

    public String getValue() {
        return value;
    }
}
