package in.co.nmsworks.training.week2.day5.bank;

public class SbiBank extends Bank{

    private String name = "sbi" ;

    @Override
    double getRate() {
        return 5;
    }

    @Override
    public String toString() {
        return "SbiBank{" +
                "name='" + name + '\'' +
                '}';
    }
}
