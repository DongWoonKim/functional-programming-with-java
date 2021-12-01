package programming;

import java.util.List;
import java.util.function.Predicate;

public class FP03_02BehaviorParameterization {

    public static void main(String[] args) {
        List<String> words = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        exam1( numbers );
    }

    public static void exam1( List<Integer> numbers ) {

//        numbers.stream()
//                .filter(evenPredicate)
//                .forEach(System.out::println);
//        System.out.println();

//        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
//        filterAndPrint(numbers, evenPredicate);
//        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
//        filterAndPrint(numbers, oddPredicate);

        filterAndPrint(numbers, x->x%2 == 0);
        filterAndPrint(numbers, x->x%2 != 0);

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

}
