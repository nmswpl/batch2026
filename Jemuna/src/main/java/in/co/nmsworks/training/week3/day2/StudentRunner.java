package in.co.nmsworks.training.week3.day2;
import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("English");
        subjects.add("Maths");
        Student student = new Student(1,"Jemuna","IT",subjects);

        subjects.add("Tamil");
        subjects.add("Maths");
        Student student2 = new Student(2,"Anu","CSE",subjects);

        subjects.add("Tamil");
        subjects.add("Maths");
        Student student3 = new Student(2,"Yaazh","IT",subjects);

        subjects.add("Tamil");
        subjects.add("Maths");
        Student student4 = new Student(4,"Aishu","CSE",subjects);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(student4);

        for (Student listOfStudent : listOfStudents) {
            System.out.println("Name : " +listOfStudent.getName()+" || Subjects  : "+listOfStudent.getSubject());

        }
    }

}
