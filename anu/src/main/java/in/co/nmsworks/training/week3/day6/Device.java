package in.co.nmsworks.training.week3.day6;

class Device {

    String name;
    int watts;
    int cycles = 0;
    boolean isOn = false;

    Device(String name, int watts) {
        this.name = name;
        this.watts = watts;
    }

    void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    void turnOff() {
        if (isOn) {
            cycles++;
            isOn = false;
        }
        System.out.println(name + " is OFF");
    }

    int getPowerUsed() {
        return cycles * watts;
    }
}