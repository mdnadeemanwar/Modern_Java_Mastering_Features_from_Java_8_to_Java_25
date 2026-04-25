package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {


    private static int totalNoOfNotebok(){
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(g->g.getGradeLevel()>=3)
                .filter(g->g.getGender().equals("female"))
                .map(Student::getNoteBook)
                .reduce(0, (a,b)->a+b);
    }
    public static void main(String[] args) {
        System.out.println("Total no of notebook ->"+totalNoOfNotebok());
    }
}
