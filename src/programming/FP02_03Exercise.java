package programming;

/*
Exercise 7
Square every number in a list and find the sum of squares

Exercise 8
Cube every number in a list and find the sum of cubes

Exercise 9
Find Sum of Odd Numbers in a list

Exercise 10
Create a List with Even Numbers Filtered from the Numbers List

Exercise 11
Create a List with lengths of all course titles.
 */

import java.util.List;
import java.util.stream.Collectors;

public class FP02_03Exercise {

    public static void main(String[] args) {

        List<String> words = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> numbers =  List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        int ret = Exercise7(numbers);
        System.out.println(ret);

        ret = Exercise8(numbers);
        System.out.println(ret);

        ret = Exercise9(numbers);
        System.out.println(ret);

        List<Integer> getList = Exercise10(numbers);
        for ( int num : getList ) System.out.println(num);

        System.out.println();
        List<Integer> getStrLenList = Exercise11(words);
        for ( int num : getStrLenList ) System.out.println(num);
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

    /*
    Exercise 10
    Create a List with Even Numbers Filtered from the Numbers List
    */
    private static List<Integer> Exercise10(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    /*
    Exercise 11
    Create a List with lengths of all course titles.
    */
    private static List<Integer> Exercise11(List<String> str) {
        return str.stream()
                .map( s -> s.length() )
                .collect(Collectors.toList());
    }

}
