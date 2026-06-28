package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    private float principal;

    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public float calculateYearlyInterest(float principal){
        float si = (principal * getRoi())/100;
        return si;
    }

    public abstract float getRoi();
}
