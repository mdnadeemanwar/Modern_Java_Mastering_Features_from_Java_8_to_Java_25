package org.learnjava.streamTerminalOperation;

import org.learnjava.data.Student;
import org.learnjava.data.StudentDataBase;

import java.util.stream.Collectors;

public class SummingIntandAveragingIntExample {



    //Q1 give me summation of all the notebooks

    public static int getSummationOfallNotebook(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBook));
    }
    public static Double getSummationOfallNotebookReduce(){
        return StudentDataBase
                .getAllStudents()
                .stream()
                .mapToDouble(Student::getNoteBook)
                .reduce(0,Double::sum);
    }



    public static Double getAveraggingOfallNotebook(){
        return StudentDataBase.getAllStudents().stream().collect(Collectors.averagingInt(Student::getNoteBook));
    }


    public static void main(String[] args) {

        System.out.println("The Sum of all the notebook is "+ getSummationOfallNotebook());

        System.out.println("Using redice"+getSummationOfallNotebookReduce());

        System.out.println("The average of the notebook is "+ getAveraggingOfallNotebook());
    }
}
