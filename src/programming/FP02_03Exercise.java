package programming;

/*
Exercise 7
Square every number in a list and find the sum of squares

Exercise 8
Cube every number in a list and find the sum of cubes

Exercise 9
Find Sum of Odd Numbers in a list
 */

import java.util.List;

public class FP02_03Exercise {

    public static void main(String[] args) {

        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int ret = Exercise7(numbers);
        System.out.println(ret);

        ret = Exercise8(numbers);
        System.out.println(ret);

        ret = Exercise9(numbers);
        System.out.println(ret);

    }

    /*
        Exercise 7
        Square every number in a list and find the sum of squares
     */
    public static int Exercise7( List<Integer> numbers ) {
        return numbers.stream()
                .map(x -> x*x)
                .reduce(0, Integer::sum);
    }

    /*
        Exercise 8
        Cube every number in a list and find the sum of cubes
     */
    public static int Exercise8( List<Integer> numbers ) {
        return numbers.stream()
                .map(x -> x*x*x)
                .reduce(0, Integer::sum);
    }

    /*
        Exercise 9
        Find Sum of Odd Numbers in a list
     */
    private static int Exercise9(List<Integer> numbers) {
//        return numbers.stream()
//                .reduce(0, (x, y) -> x + ( y % 2 != 0 ? y : 0 ) );

        return numbers.stream()
                .filter(x -> x % 2 == 1)
                .reduce(0, Integer::sum);
    }

}
