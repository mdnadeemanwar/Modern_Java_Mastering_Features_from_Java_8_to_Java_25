package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {


    //first create predicate
    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    //creating a bipredicate here
    BiPredicate<Integer,Double> biPredicate = (gradeLevel,gpa)->gradeLevel>=3 && gpa>=3.9;

    BiConsumer<String, List<String>> biConsumer = (name, activites) -> System.out.println(name + " " + activites);

    Consumer<Student> studentConsumer = (student -> {
//        if (p1.and(p2).test(student)) {
//            biConsumer.accept(student.getName(), student.getActivities());
//        }

        //instead of this we will pass the bipredicate
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivity(List<Student> students) {
        students.forEach(studentConsumer);
    }


    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameAndActivity(studentList);
    }
}
