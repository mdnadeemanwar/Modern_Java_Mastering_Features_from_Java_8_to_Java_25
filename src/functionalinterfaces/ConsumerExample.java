package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    static Consumer<Student> c3 = (s) -> {
        System.out.println(s.getName() + "+" + s.getActivities());
    };
    static Consumer<Student> c2 = (s) -> System.out.println(s);


    public static void printName() {

        List<Student> studentList = StudentDataBase.getAllStudents();

        //it will take consumer interface
        studentList.forEach(c2);
    }

    public static void printNameandActivity() {

        List<Student> studentList1 = StudentDataBase.getAllStudents();

        studentList1.forEach(c3);
    }

    public static void printNameandActivityUsingGrade(){
        List<Student> studentList1 = StudentDataBase.getAllStudents();

        studentList1.forEach(student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                c2.andThen(c3).accept(student);
            }
        });
    }


    public static void main(String[] args) {

    //implimenting using the java8
        Consumer<String> st = (s) -> System.out.println(s.toUpperCase());
        st.accept("java 8");

        //creating one class for printonlyname
        //now calling the function with name
        printName();
        printNameandActivity();
        printNameandActivityUsingGrade();

    }

}
