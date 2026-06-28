package in.co.nmsworks.training.week2.Day1.Day5.Battery;

public class Phone implements BatteryPowered {
    private int phone_level = 100;

    public int batteryUsagePerHour() {
        return 14;
    }

    public int batteryAfterUse(float hours) {
        phone_level = (int) (phone_level - batteryUsagePerHour() * hours);
        return phone_level;
    }


}
