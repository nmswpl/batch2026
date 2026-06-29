package in.co.nmsworks.training.week2.day5;

public class Drone implements BatteryPowered {

    private int batteryPercentage;

    public Drone() {
        this.batteryPercentage = 100;
    }

    @Override
    public int batteryUsagePerHour() {
        return 10;
    }

    @Override
    public int batteryAfterUse(float hours) {
//        batteryPercentage = (batteryPercentage - ((int)hours * batteryUsagePerHour()));
//        return batteryPercentage;

        int updatedBatteryPercentage = (batteryPercentage - (int)(hours * batteryUsagePerHour()));

        System.out.println("Battery -> " + batteryPercentage);
        if(updatedBatteryPercentage < 0){
            return -1;
        }

        batteryPercentage = updatedBatteryPercentage;
        return batteryPercentage;
    }


}
