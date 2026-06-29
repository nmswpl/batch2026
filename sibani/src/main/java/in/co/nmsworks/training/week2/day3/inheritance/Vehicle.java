package in.co.nmsworks.training.week2.day3.inheritance;

public class Vehicle {
    private Enginee enginee;





    public Enginee getEnginee() {
        return enginee;
    }

    public void setEnginee(Enginee enginee) {
        this.enginee = enginee;
    }



    @Override
    public String toString() {
        return "Vehicle{" +
                "enginee=" + enginee +
                '}';
    }
}
