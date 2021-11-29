package programming;

import java.util.List;

public class FP01_02Functional {
    public static void main(String[] args) {
//        printAllNumbersInListFunctional( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
//        printEvenNumbersInListFunctional( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
        printSquaresOfEvenNumbersInListFunctional( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    // Lambda : number -> number % 2 == 0

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // what to do?
        numbers.stream().forEach(FP01_02Functional::print);
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
//                .filter(FP01_02Functional::isEven) // Filter - Only Allow Even Numbers
                .filter(number -> number%2 == 0)  // Lambda Expression
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number%2 == 0)  // Lambda Expression
                .map(number -> number * number) // mapping - x -> x * x
                .forEach(System.out::println);
    }
}
