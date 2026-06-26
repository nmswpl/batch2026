package in.co.nmsworks.training.week2.day3;

public class ObjectArray {
    public static void main(String[] args) {
        ObjectArray oa = new ObjectArray();
        Cars cars[] = new Cars[5];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Cars(i+1, "Model"+(i+1));
            System.out.println(cars[i]);
        }
    }
}
