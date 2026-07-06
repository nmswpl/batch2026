package in.co.nmsworks.training.week4.day1;

public class Data {
    private int year;
    private String industry_code_ANZSIC;
    private String industry_name_ANZSIC;
    private String rme_size_grp;
    private String variable;
    private String value;
    private String unit;

    public Data(int year, String industry_code_ANZSIC, String industry_name_ANZSIC, String rme_size_grp, String variable, String value, String unit) {
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

    public void setYear(int year) {
        this.year = year;
    }

    public String getIndustry_code_ANZSIC() {
        return industry_code_ANZSIC;
    }

    public void setIndustry_code_ANZSIC(String industry_code_ANZSIC) {
        this.industry_code_ANZSIC = industry_code_ANZSIC;
    }

    public String getIndustry_name_ANZSIC() {
        return industry_name_ANZSIC;
    }

    public void setIndustry_name_ANZSIC(String industry_name_ANZSIC) {
        this.industry_name_ANZSIC = industry_name_ANZSIC;
    }

    public String getRme_size_grp() {
        return rme_size_grp;
    }

    public void setRme_size_grp(String rme_size_grp) {
        this.rme_size_grp = rme_size_grp;
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

    public Data() {
    }

    @Override
    public String toString() {
        return "Data{" +
                "year='" + year + '\'' +
                ", industry_code_ANZSIC='" + industry_code_ANZSIC + '\'' +
                ", industry_name_ANZSIC='" + industry_name_ANZSIC + '\'' +
                ", rme_size_grp='" + rme_size_grp + '\'' +
                ", variable='" + variable + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}



