package in.co.nmsworks.training.week3.day6.automatedReceptionist;

public class Tamil implements Language{
        @Override
        public void welcome(String name) {
            System.out.println("Vanakkam " + name + ", engaladhu hotel-ukku ungalai varaberkirom!");
        }

        @Override
        public void goodbye(String name) {
            System.out.println("Nandri " + name + ", meendum varuga, nalvazhi payanam amaiyattum!");
        }
    }

