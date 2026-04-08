import java.util.stream.IntStream;

public class AddallnousingImperativeandDeclrative {
    public static void main(String[] args) {


        //Question add all the no from 1 to 100

        //Imperative Approach

        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("The sum of all is using imperative approach -> "+sum);


        //Declrative Approach

        int total = IntStream.rangeClosed(0,100).sum();
        System.out.println("The sum of all is using declrative approach -> "+total);
    }
}
