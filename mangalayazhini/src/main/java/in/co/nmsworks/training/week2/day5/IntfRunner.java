package in.co.nmsworks.training.week2.day5;

public class IntfRunner {
    public static void main(String[] args) {
        //  Dog dog = new Dog();
        // dogMethod(dog);


        //  Cat cat = new Cat();
        // catMethod(cat);

//        Animal cat = new Cat();
//        // cat.play() not visible
//        Animal dinosour = new Animal(){
//            public void eat(){
//                System.out.println("Dinosour eats");
//            }
//            public void makeSound(){
//                System.out.println("Dinosour makes sound");
//            }
//        };
//
//        dinosour.makeSound();


//        animalMethod(dog);
//        animalMethod(cat);
//
//        dog.smell();
//        cat.play();
//
//        landBased(dog);


//        A objA = new B();
//        objA.methodOfA();
//        objA.show();
//        objA.methodOfB();


    }



    private static void catMethod(Cat cat) {
        cat.eat();
        cat.makeSound();
    }

    private static void dogMethod(Dog dog) {
        dog.eat();
        dog.makeSound();
    }

    private static void animalMethod(Animal animal) {
        System.out.println("\nGeneral method of Animal:");
        animal.makeSound();
        animal.eat();

    }

    private static void landBased(LandBased landBased){
        System.out.println("\nGeneral method of LandBased:");
        landBased.canClimb();
        landBased.canWalk();
        landBased.makeSound();
        landBased.eat();
    }
}
