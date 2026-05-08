package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultExample1 {

    public static Consumer<Student> nameConsumer = name -> System.out.println("Name is " + name);
    public static Comparator<Student> studentNameComperator = Comparator.comparing(Student::getName);
    public static Comparator<Student> studentGpaComperator = Comparator.comparingDouble(Student::getGpa);

    public static void sortByName(List<Student> studentList) {
        studentList.sort(studentNameComperator);
        studentList.forEach(nameConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        studentList.sort(studentGpaComperator);
        studentList.forEach(nameConsumer);
    }

    public static void comperatorChaining(List<Student> studentList) {
        studentList.sort(studentGpaComperator.thenComparing(studentNameComperator));
        studentList.forEach(nameConsumer);
    }

    //suppose if any null value present then how to handle this
    public static void comperatorNullValueHandle(List<Student> studentList) {
        Comparator<Student> studentNullValueComparator = Comparator.nullsFirst(studentNameComperator);
        studentList.sort(studentNullValueComparator);
        studentList.forEach(nameConsumer);
    }

    public static void main(String[] args) {

        System.out.println("Before sorting");
        List<Student> studentList = StudentDataBase.getAllStudents();
//        System.out.println("Details of all the student -->"+studentList);
        studentList.forEach(nameConsumer);
        System.out.println("After sorting");

        //sort the student name by name
//        sortByName(studentList);

        //sort by GPa
        System.out.println("After sorting by GPA");
//        sortByGpa(studentList);

        //comperator chaining
        System.out.println("ComperatorChaining");
//        comperatorChaining(studentList);

        //handle null value
        System.out.println("After Handling null value");
        comperatorNullValueHandle(studentList); //it will work fine

    }
}
