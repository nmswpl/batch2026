package in.co.nmsworks.training.week2.day5;

class Cat implements Animal,LandBased{


    @Override
    public boolean canClimb() {
        System.out.println("Cat can climb");
        return true;
    }

    @Override
    public boolean canwalk() {
        System.out.println("Cat can walk");
        return true;
    }

    @Override
    public void eat() {
        System.out.println("Cat drinks milk");

    }

    @Override
    public void makeSound() {
        System.out.println("Cat makes meow sound");

    }

    public void play(){
        System.out.println("Cat is playing with the ball");
    }
}
