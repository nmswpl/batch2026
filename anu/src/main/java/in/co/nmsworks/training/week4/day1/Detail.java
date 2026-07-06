package in.co.nmsworks.training.week4.day1;

public class Detail {
    private int year;
    private String industry_code_ANZSIC;
    private String industry_name_ANZSIC;
    private String rme_size_grp;
    private String variable;
    private String value;
    private String unit;

    public String getUnit() {
        return unit;
    }

    public Detail(int year, String industry_code_ANZSIC, String industry_name_ANZSIC, String rme_size_grp, String variable, String value, String unit) {
        this.year = year;
        this.industry_code_ANZSIC = industry_code_ANZSIC;
        this.industry_name_ANZSIC = industry_name_ANZSIC;
        this.rme_size_grp = rme_size_grp;
        this.variable = variable;
        this.value = value;
        this.unit = unit;
    }

    public int getYear() {
        return year;
    }

    public String getIndustry_code_ANZSIC() {
        return industry_code_ANZSIC;
    }

    public String getIndustry_name_ANZSIC() {
        return industry_name_ANZSIC;
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
