package lambdas;

public class RunnableLambdaExample {


    public static void main(String[] args) {


//        Before java 8
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is runnable interface");
            }
        };


        new Thread(run).start();


        //After java 8

        //()->{} java 8 syntax
        Runnable runlambda =()->{
            System.out.println("THis is for runnable lambda");
        };

        Runnable runlambda1 = ()-> System.out.println("Lambda 1");

        new Thread(runlambda).run();
        new Thread(runlambda1).run();



    }


}
