package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered{
    int battery = 100;
    @Override
    public int batteryUsagePerHour() {
        return 20;
    }



    public int batteryAfterUse(float hours){
        return (int) (battery - batteryUsagePerHour() * hours);
    }
}

