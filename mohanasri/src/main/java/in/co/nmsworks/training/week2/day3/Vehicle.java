package in.co.nmsworks.training.week2.day3;

public class Vehicle {
    private String colour;
    private int noOfWheels;

//    public Vehicle(int noOfWheels, String colour) {
//        this.noOfWheels = noOfWheels;
//        this.colour = colour;
//    }
 static class Engine{
        private String fuelType;
        private int cc;
        public Engine(){}
        public Engine(String fuelType, int cc) {
            this.fuelType = fuelType;
            this.cc = cc;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }

    @Override
    public String toString() {
        return "Engine{" +
                "fuelType='" + fuelType + '\'' +
                ", cc=" + cc +
                '}';
    }
}
}


