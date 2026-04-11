package functionalinterfaces;

public class FunctionExample1 {
    public static String performConcatString(String str){
        return FunctionExample.addsomestring.apply(str);
    }
    public static void main(String[] args) {
        String result = performConcatString("Hello");
        System.out.println("Result is "+result);

    }
}
