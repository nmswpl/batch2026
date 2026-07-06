package in.co.nmsworks.training.week3.day5;

public abstract class Appliance {
    private String name;
    private Integer powerRatings;
    private Boolean isOn = false;
    private Integer switchPressed = 0 ;

    public Appliance(String name, Integer powerRatings) {
        this.name = name;
        this.powerRatings = powerRatings;
    }

    public Integer getPowerRatings() {
        return powerRatings;
    }

    public void setPowerRatings(Integer powerRatings) {
        this.powerRatings = powerRatings;
    }

    public Boolean getOn() {
        return isOn;
    }

    public void setOn(Boolean on) {
        isOn = on;
    }

    public void switchPressedCount(){
        System.out.println("Switch Pressed Count : " + switchPressed);
    }

    public void switchOn(){

        if(isOn == true){
            System.out.println("The appliance is already On");
        }
        else{
            System.out.println("The appliance is On");
            isOn = true;
            switchPressed++;
        }

    }
    public void switchOff(){
        if(isOn == false){
            System.out.println("The appliance is already Off");
        }
        else{
            System.out.println("The appliance is Off");
            isOn = false;
            switchPressed++;
        }
    }

    public Integer calculateCycles(){
        Integer noOfCycles = null ;
        if(switchPressed % 2 == 0){
            noOfCycles = switchPressed/2 ;
            System.out.println("no of cycles = " + noOfCycles);
        }
        else{
            System.out.println("The Appliance is not yet switched off !");
        }
        return noOfCycles;
    }

    public Integer calculateTotalPowerUsed(){
        Integer cyclesCompleted = calculateCycles();
        if(cyclesCompleted != null){
            Integer powerUsed = cyclesCompleted * powerRatings;
            System.out.println("Power Used : "+powerUsed);
            return powerUsed;
        }
        else{
            System.out.println("Turn off the appliance to calculate power");
            return 0;
        }
    }
}
