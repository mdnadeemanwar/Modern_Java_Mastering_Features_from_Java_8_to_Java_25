package optional;

import data.Student;
import data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {
    //create a method for getStudentName

    public static List<String> getOnlyStudentName() {
        List<String> names = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
        return names;
    }

    public static String getStudentName() {
        Student student = StudentDataBase.getAllStudents().get(0);

        //put the student null thensee
//        Student student = null;

        if (student != null) {
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {

//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.getAllStudents().getFirst());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        if (studentOptional.isPresent()) {
            return Optional.of(studentOptional.get().getName());
        }

        return Optional.empty();

    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        if(name == null){
//            System.out.println("Student name is null");
//        }
//        System.out.println("Name is "+name.length()+" characters");

        Optional<String> name = getStudentNameOptional();
        if (name.isPresent()) {
            System.out.println(name.get());
        }else{
            System.out.println("Name not found");
        }

//        System.out.println(getStudentNameOptional());
    }
}
