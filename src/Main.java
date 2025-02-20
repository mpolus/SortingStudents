public class Main {
    public static void main(String[] args) {

        var reverseGrade = new GradeComparator().reversed();
        // TODO: create your age Comparator here call it age here.

        // TODO: make your list of students.
        Student.add(new Student("Alice", 10, 15 ));

        // TODO: sort then using reverseGrade.andThenComparing(age)
        students.sort(reverseGrade.thenComparing(age));

        // TODO: print out the list


    }
}