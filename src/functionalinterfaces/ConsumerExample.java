package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {




    public static void printName(){

        Consumer<Student> C2 = (s)-> System.out.println(s);

        List<Student> studentList =    StudentDataBase.getAllStudents();

        //it will take consumer interface
        studentList.forEach(C2);
    }

    public static void printNameandActivity(){

        //create a consumer
        Consumer<Student> c3 = (s)-> {
            System.out.println(s.getName() + "+" + s.getActivities() );
        };

        List<Student> studentList1 = StudentDataBase.getAllStudents();

        studentList1.forEach(c3);
    }




    public static void main(String[] args) {


//        implimenting using the java8
        Consumer<String> st = (s)-> System.out.println(s.toUpperCase());
        st.accept("java 8");



        //creating one class for printonlyname
        //now calling the function with name
        printName();
        printNameandActivity();

    }

}
