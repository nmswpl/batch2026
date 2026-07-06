package in.co.nmsworks.training.week2.day5;

public class Dog implements Animal,LandBased {



    @Override
    public void makeSound() {
        System.out.println("dog sound");
    }

    @Override
    public void eat() {
        System.out.println("dog eats ");

    }

    public void smell(){
        System.out.println("Dog smell");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClimb() {
        return false;
    }
}
