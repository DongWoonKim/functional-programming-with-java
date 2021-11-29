package programming;

import java.util.List;

public class FP02_01Structured {

    public static void main(String[] args) {
        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListStuctured( numbers );
        System.out.println(sum);
    }

    private static int addListStuctured(List<Integer> numbers) {
        // how to loop?
        // how to store the sum?

        int sum = 0;
        for ( int number : numbers ) {
            sum += number;
        }

        return sum;
    }

}
