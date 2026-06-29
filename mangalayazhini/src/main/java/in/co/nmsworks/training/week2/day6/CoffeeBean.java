package in.co.nmsworks.training.week2.day6;

public class CoffeeBean {
    private String beanName;
    private String roastLevel;

    CoffeeBean(String beanName, String roastLevel){
        this.beanName = beanName;
        this.roastLevel = roastLevel;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getRoastLevel() {
        return roastLevel;
    }

    public void setRoastLevel(String roastLevel) {
        this.roastLevel = roastLevel;
    }


}
