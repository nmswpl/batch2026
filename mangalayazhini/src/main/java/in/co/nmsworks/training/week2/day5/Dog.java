package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal, LandBased{


    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound");
    }

    public void smell(){
        System.out.println("Dog smells");
    }


    @Override
    public Boolean canWalk() {
        System.out.println("Dog can walk");
        return true;
    }

    @Override
    public Boolean canClimb() {
        System.out.println("Dog cannot climb");
        return false;
    }
}
