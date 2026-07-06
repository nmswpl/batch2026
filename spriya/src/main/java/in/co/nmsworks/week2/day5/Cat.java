package in.co.nmsworks.week2.day5;

public class Cat implements Animal, LandBased {
    public void makeSound(){
        System.out.println("Meow");
    }

    public void eat(){
        System.out.println("Milk");
    }

    public void play(){
        System.out.println("Cat can play");
    }

    @Override
    public boolean canclimb() {
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}
