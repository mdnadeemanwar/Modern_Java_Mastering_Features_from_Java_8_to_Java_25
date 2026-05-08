package defaults;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> numbers);

    default int size(List<Integer> numbers) {
        System.out.println("Inside the Multiplier interface");
        return numbers.size();
    }

    static boolean checkListEmpthy(List<Integer> numbers) {
        return numbers.isEmpty();
    }


}
