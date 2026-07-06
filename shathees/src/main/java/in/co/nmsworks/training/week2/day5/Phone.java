package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{

    public Phone() {
    }

    public int batteryUsagePerHour() {
        return 5;
    }

    public int batteryAfterUse(float hours) {
        int usage = (int)(100 - batteryUsagePerHour()* hours) ;
        return  usage;
    }
}
