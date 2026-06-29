package in.co.nmsworks.training.week2.day5.animal;

public class Cat implements Animal, LandBased {
    @Override
    public void eat() {
        System.out.println("cat eats");
    }

    @Override
    public void makeSound() {
        System.out.println("cat meows");
    }

    public void play(){
        System.out.println("cat Plays");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClimb() {
        return true;
    }
}
