package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    //Collect only the Gendar Male
    public static List<Student> filterMaleStudent() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(f ->f.getGpa()>=3.9)
//                .filter(f -> f.getGender().equals("male"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Filter only male student" + filterMaleStudent());
    }
}
