package streamParallel;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamExample {

    public static int sum_sequential_stream(){
        return IntStream.rangeClosed(1, 1000000).sum();
    }
    public static int sum_parallel_stream(){
        return IntStream.rangeClosed(1, 1000000).parallel().sum();
    }

    public static long checkPerformanceMethod(Supplier<Integer> supplier , int notOfTimes){
        long currentTime = System.currentTimeMillis();

        for(int i = 0; i < notOfTimes; i++){
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return (endTime - currentTime);

    }

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        //Give me one normal stream example
//
//        list.stream().forEach(nums -> {
//            System.out.println("Normal Stream->" + nums + Thread.currentThread().getName());
//        });
//
//        //Give me parallel stream example
//        list.stream().parallel().forEach(nums -> {
//            System.out.println("Parallel Stream->" + nums + Thread.currentThread().getName());
//        });

//        int time =  sum_sequential_stream();
//        int time1= sum_parallel_stream();
//        System.out.println(time);
//        System.out.println(time1);


        System.out.println("Sequential stream-->"+checkPerformanceMethod(ParallelStreamExample::sum_sequential_stream, 20));
        System.out.println("Parallel stream-->"+checkPerformanceMethod(ParallelStreamExample::sum_parallel_stream, 20));


    }
}
