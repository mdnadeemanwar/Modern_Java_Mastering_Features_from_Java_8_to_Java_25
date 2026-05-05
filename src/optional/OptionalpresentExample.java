package optional;

import java.util.Optional;

public class OptionalpresentExample {


    public static void main(String[] args) {
        //isPresent

//        Optional<String> optionalisPresent = Optional.ofNullable("Hello optional");
        Optional<String> optionalisPresent = Optional.ofNullable(null);
        System.out.println(optionalisPresent.isPresent());  //true false depend upon the data


        //ifPresent

        optionalisPresent.ifPresent(s-> System.out.println(s)); // if present then print otherwise no

    }
}
