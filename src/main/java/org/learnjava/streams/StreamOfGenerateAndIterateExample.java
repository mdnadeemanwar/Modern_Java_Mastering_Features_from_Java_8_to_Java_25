package streams;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class StreamOfGenerateAndIterateExample {


    public static void main(String[] args) {
     Stream<String> myStream =   Stream.of("Adam","Jam","Jullie","Mahak");


        myStream.forEach(System.out::println);


        //using the iterate method
        Stream.iterate(1, x->x*2).forEach(System.out::println);
    }
}
