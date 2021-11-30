package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02_02Functional {

    public static void main(String[] args) {
        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<Integer> doubledNumbers = doubleList( numbers );
        List<String> words = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        /*
        int sum = addListFunctinal( numbers );
        System.out.println(sum);
        sum = addListFunctinal2(numbers);
        System.out.println(sum);
        removeDuplicateFunctional(numbers);
        sortedFunctional(numbers);
        */

        sortedWordsFunctional(words);
        sortedWordsFunctional2(words);
        for ( int num : doubledNumbers ) System.out.println(num);
    }

    private static int sum( int aggregate, int nextNumber ) {
        System.out.println(aggregate + " : " + nextNumber);
        return aggregate + nextNumber;
    }

    private static int addListFunctinal(List<Integer> numbers) {
        return numbers.stream()
                // Combine them into one result => One Value
                // 0 and (a, b) -> a + b
                .reduce(0, FP02_02Functional::sum);
    }

    private static int addListFunctinal2(List<Integer> numbers) {
        return numbers.stream()
                // Combine them into one result => One Value
                // 0 and (a, b) -> a + b
//                .reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    private static void removeDuplicateFunctional(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void sortedFunctional(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static void sortedWordsFunctional(List<String> str) {
        str.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void sortedWordsFunctional2(List<String> str) {

        // 역정렬
        str.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println();

        // 문자열 길이 기준으로 정렬
        str.stream()
                .sorted(Comparator.comparing( s -> s.length() ))
                .forEach(System.out::println);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }


}
