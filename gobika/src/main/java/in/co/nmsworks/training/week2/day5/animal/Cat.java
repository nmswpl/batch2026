package in.co.nmsworks.training.week2.day5.animal;

public class Cat implements Animal, LandBased {
    @Override
    public void eat() {
        System.out.println("Milk");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
    public void play(){
        System.out.println("Can play..");
    }

    @Override
    public boolean canWalk() {
        return true;
    }

    @Override
    public boolean canClaim() {
        return true;
    }
}
