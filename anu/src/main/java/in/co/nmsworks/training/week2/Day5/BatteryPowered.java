package in.co.nmsworks.training.week2.Day5;

interface BatteryPowered {
    int batteryUsagePerHour();
    int batteryAfterUse(float hours);
    //another way of method
    // default int batteryAfterUse(float hours){}
}
