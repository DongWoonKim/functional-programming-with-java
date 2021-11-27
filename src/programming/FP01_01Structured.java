package programming;

import java.util.List;

public class FP01_01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
        printEvenNumbersInListStructured( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
    }

    // 전체 출력
    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for ( int num : numbers ) System.out.print(num + " ");
        System.out.println("");
    }

    // 짝수 출력
    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for ( int num : numbers ) {
            if ( num % 2 != 0 ) continue;
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
