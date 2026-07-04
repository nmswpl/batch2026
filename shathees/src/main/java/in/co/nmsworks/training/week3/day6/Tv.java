package in.co.nmsworks.training.week3.day6;

public class Tv extends Device{


    public Tv(String deviceName, boolean isOn, int count, int wattsPerCycle) {
        super(deviceName, isOn, count, wattsPerCycle);
    }

    @Override
    void toggleOn() {
        if (isOn == true){
            System.out.println("already on");
        }
        isOn = true;
        System.out.println("Tv is on");
    }

    @Override
    void toggleOff() {
        if (isOn == false){
            System.out.println("already off");
            return;
        }
        isOn = false;
        System.out.println("tv is off");
        count ++;

    }

    @Override
    int countCycle() {
        return count;
    }

    @Override
    int powerUsage() {
        return count*wattsPerCycle;
    }
}
