package in.co.nmsworks.training.week2.day5;

import javax.crypto.spec.PSource;

public class Cat implements Animal, LandBased{
    @Override
    public void makesSound() {
        System.out.println("Meows");
    }

    @Override
    public void eats() {
        System.out.println("Cat eats");
    }

    public void play(){
        System.out.println("Cat plays");
    }

    @Override
    public boolean canClimb(){
        return true;
    }

    @Override
    public boolean canWalk() {
        return true;
    }
}

