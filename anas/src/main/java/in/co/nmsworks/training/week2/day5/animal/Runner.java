package in.co.nmsworks.training.week2.day5.animal;

public class Runner {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        //dogMethod(dog1);

        Cat cat1 = new Cat();
        //catMethod(cat1);

        animalMethod(dog1);
        animalMethod(cat1);

        landBasedMethod(dog1);
        landBasedMethod(cat1);
    }

    private static void landBasedMethod(LandBased landBased) {
        System.out.println(landBased.canClimb());
        System.out.println(landBased.canWalk());
    }

    private static void animalMethod(Animal animal) {
        animal.eat();
        animal.makeSound();
    }

    private static void catMethod(Cat cat1) {
        cat1.eat();
        cat1.makeSound();
    }

    private static void dogMethod(Dog dog1) {
        dog1.eat();
        dog1.makeSound();
    }

}
