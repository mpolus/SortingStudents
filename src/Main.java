import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var reverseGrade = new GradeComparator().reversed();
        var age = new AgeComparator();

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 10, 15 ));
        students.add(new Student("Alexa", 11, 16 ));
        students.add(new Student("Olivia", 12, 17 ));
        students.add(new Student("Dylan", 9, 14 ));

        students.sort(reverseGrade.thenComparing(age));
        students.sort(age.thenComparing(reverseGrade));

        for (Student student : students) {
            System.out.println(student);
        }


    }
}