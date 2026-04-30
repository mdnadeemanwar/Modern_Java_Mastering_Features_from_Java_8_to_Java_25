package numericStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapToObjExample {

    public static List<Integer> MapToObjExample() {
        return IntStream.rangeClosed(1, 10).mapToObj(s-> new Integer(s)).collect(Collectors.toList());
    }

    public static Long MapToLong(){
        return IntStream.rangeClosed(1, 10).mapToLong(s->s).sum();
    }
    public static Double MapToDouble(){
        return IntStream.rangeClosed(1, 10).mapToDouble(s->s).sum();
    }
    public static void main(String[] args) {

        System.out.println("MapToObj example is "+MapToObjExample());

        System.out.println("MapToLong example is "+MapToLong());

        System.out.println("MapToDouble example is "+MapToDouble());

    }
}
