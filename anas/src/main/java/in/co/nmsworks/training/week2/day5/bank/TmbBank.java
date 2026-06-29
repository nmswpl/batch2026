package in.co.nmsworks.training.week2.day5.bank;

public class TmbBank extends Bank{

    private String name = "tmb" ;
    @Override
    double getRate() {
        return 3;
    }

    @Override
    public String toString() {
        return "TmbBank{" +
                "name='" + name + '\'' +
                '}';
    }
}
