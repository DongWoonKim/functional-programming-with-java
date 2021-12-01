package programming;

/*
    Exercise 12
    Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.
    int sum = numbers.stream() .reduce(0, Integer::sum);

    Exercise 13
    Do Behavior Parameterization for the mapping logic.
    List s
 */

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FP03_03Exercise {

    public static void main(String[] args) {
        List<String> words = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Exercise12( numbers );
    }

    /*
        Exercise 12
        Find Functional Interface behind the second argument of reduce method. Create an implementation for the Functional Interface.
    */
    public static void Exercise12( List<Integer> numbers ) {
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }
        };
        BinaryOperator<Integer> sumBinaryOperator3 = (x, y) -> x + y;

        int sum = numbers.stream()
                .reduce(0, sumBinaryOperator);
//        System.out.println(sum);
        Exercise13(numbers);
    }

    /*
    Exercise 13
    Do Behavior Parameterization for the mapping logic.
    List squaredNumbers = numbers.stream() .map(x -> x*x) .collect(Collectors.toList());
    */
    public static void Exercise13( List<Integer> numbers ) {

        Function<Integer, Integer> mappingFunction = x -> x * x;
        List<Integer> squaredNumbers1 = mapAndCreateNewList(numbers, mappingFunction);

        List<Integer> squaredNumbers2 = mapAndCreateNewList(numbers, x -> x * x);
        List<Integer> cubedNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
        List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);

        System.out.println(doubledNumbers);
    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }


}
