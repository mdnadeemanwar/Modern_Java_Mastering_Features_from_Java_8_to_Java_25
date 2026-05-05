package optional;

import java.util.Optional;

public class OptionalOfEmpthyNullableExample {


    public static Optional<String> ofNullable() {
//        Optional<String> optionalString = Optional.ofNullable("Nadeem");
        Optional<String> optionalString = Optional.ofNullable(null);
        return optionalString;
    }

    public static Optional<String> ofMethod() {
//        Optional<String> optionalString = Optional.ofNullable("Nadeem");
        Optional<String> optionalString = Optional.of("Hello");
        return optionalString;
    }

    public static void main(String[] args) {

        if (ofNullable().isPresent()) {
            System.out.println(ofNullable().get());
        } else {
            System.out.println("Value is null");
        }
        System.out.println("OptionalOfEmpthyNullableExample-->" + ofNullable());


        //ofMetho Example

        if (ofMethod().isPresent()) {
            System.out.println(ofMethod().get());
        } else {
            System.out.println("Value is null");
        }
        System.out.println("OptionalOfExample-->" + ofMethod().get());
    }
}
