package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduceExample {

    public static Optional<Student> getHeightGPAResult() {
        return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> {
            if (s1.getGpa() > s2.getGpa()) {
                return s1;
            } else {
                return s2;
            }
        });
    }


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(numbers.stream().reduce(1, (x, y) -> x * y));

        //System.out.println(numbers.stream().reduce(0, (x, y) -> x - y));

        //Exp - I want heighest gpa student with the help of reduce

        Optional<Student> result = getHeightGPAResult();
        if(result.isPresent()) {
            System.out.println(result.get());
        }


    }
}
