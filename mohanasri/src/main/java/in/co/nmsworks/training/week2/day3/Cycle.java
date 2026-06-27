package in.co.nmsworks.training.week2.day3;

public class Cycle extends Vehicle{
       private  String model;


        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    @Override
    public String toString() {
        return "Cycle{" +
                "model='" + model + '\'' +
                '}';
    }
}

