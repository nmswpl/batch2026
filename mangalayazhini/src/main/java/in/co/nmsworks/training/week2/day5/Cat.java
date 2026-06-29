package in.co.nmsworks.training.week2.day5;

public class Cat implements Animal, LandBased{


    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat makes sound");
    }

    public void play(){
        System.out.println("Cat plays");
    }

    @Override
    public Boolean canWalk() {
        return true;
    }

    @Override
    public Boolean canClimb() {
        return true;
    }
}
