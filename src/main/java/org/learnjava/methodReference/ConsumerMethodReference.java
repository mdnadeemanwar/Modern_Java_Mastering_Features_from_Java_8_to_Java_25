package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {

    static Consumer<Student> c1 =  System.out::println;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
    }
}