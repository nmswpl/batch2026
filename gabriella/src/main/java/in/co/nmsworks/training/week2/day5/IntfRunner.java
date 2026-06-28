package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // dogMethod(dog);
        Cat cat = new Cat();
        // catMethod(cat);
        animalMethod(dog);
        animalMethod(cat);
        System.out.println(" ");
        landbasedMethod(dog);
        landbasedMethod(cat);
    }

    private static void animalMethod(Animal animal){
        animal.makesSound();
        animal.eats();
    }

    private static void landbasedMethod(LandBased animal){
        animal.makesSound();
        animal.eats();
        System.out.println("Climbs: " + animal.canClimb());
        System.out.println("Walks: " + animal.canWalk());
    }

    private static void catMethod(Cat cat) {
        cat.makesSound();
        cat.eats();
        cat.canWalk();
        cat.canClimb();
    }

    private static void dogMethod(Dog dog) {
        dog.makesSound();
        dog.eats();
        dog.canClimb();
        dog.canWalk();
    }
}
