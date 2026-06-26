package in.co.nmsworks.training.week2.day5;

class Dog implements Animal,LandBased{

    @Override
    public boolean canClimb() {
        System.out.println("Dog cannot climb");
        return false;
    }

    @Override
    public boolean canwalk() {
        System.out.println("Dog can walk");
        return true;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bone");

    }

    @Override
    public void makeSound() {
        System.out.println("Bow Bow");
    }

    public void smell(){
        System.out.println("Smell");
    }
}
