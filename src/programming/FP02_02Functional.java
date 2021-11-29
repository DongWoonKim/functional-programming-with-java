package programming;

import java.util.List;

public class FP02_02Functional {

    public static void main(String[] args) {
        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListFunctinal( numbers );
        System.out.println(sum);
        sum = addListFunctinal2(numbers);
        System.out.println(sum);

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

}
