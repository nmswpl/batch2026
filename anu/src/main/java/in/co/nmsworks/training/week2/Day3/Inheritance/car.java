package in.co.nmsworks.training.week2.Day3.Inheritance;

class car extends Vehicle{
    protected String manufacture;

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "car{" +
                "manufacture='" + manufacture + '\'' +super.toString()+
                '}';
    }
}
