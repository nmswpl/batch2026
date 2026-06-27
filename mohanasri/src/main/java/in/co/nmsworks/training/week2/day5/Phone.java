package in.co.nmsworks.training.week2.day5;

public class Phone implements BatteryPowered{
    int battery = 100;
    @Override
    public int batteryUsagePerHour() {
        return 10;
    }



    public int batteryAfterUse(float hours){
        return (int) (battery - batteryUsagePerHour() * hours);
    }
}
