package in.co.nmsworks.training.week2.Day3.Inheritance;


class bike extends Vehicle{

    protected String model;
    protected int numberOfTyper;

    public bike() {
    }

    public bike(String model, int numberOfTyper) {
        this.model = model;
        this.numberOfTyper = numberOfTyper;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfTyper() {
        return numberOfTyper;
    }

    public void setNumberOfTyper(int numberOfTyper) {
        this.numberOfTyper = numberOfTyper;
    }

    @Override
    public String toString() {
        return "bike{" +'\'' +
                "model='" + model + '\'' +
                ", numberOfTyper=" + numberOfTyper + super.toString()+
                '}';
    }
}
