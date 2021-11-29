package programming;

import java.util.List;

public class FP01_03Exercise {

    /*
        Exercise 1
        Print Only Odd Numbers from the List

        Exercise 2
        Print All Courses individually

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")

        Exercise 3
        Print Courses Containing the word "Spring"

        Exercise 4
        Print Courses Whose Name has atleast 4 letters

        Exercise 5
        Print the cubes of odd numbers

        Exercise 6
        Print the number of characters in each course name

     */
    public static void main(String[] args) {
//        PrintOddNumbers( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
//        PrintAllStr( List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes") );
//        PrintSpringWord( List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes") );
//        PrintMoreThan4Letters( List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes") );
//        PrintCubesOfOddNumbers( List.of(12, 9, 13, 4, 6, 2, 4, 12, 15) );
        PrintNumberOfCharacters( List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes") );
    }

    /*
    Exercise 1
    Print Only Odd Numbers from the List
    */
    public static void PrintOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    /*
        Exercise 2
        Print All Courses individually
     */
    public static void PrintAllStr(List<String> str) {
        str.stream()
                .forEach(System.out::println);
    }

    /*
        Exercise 3
        Print Courses Containing the word "Spring"
     */
    public static void PrintSpringWord(List<String> str) {
        str.stream()
                .filter( s -> s.contains("Spring") )
                .forEach(System.out::println);
    }

    /*
        Exercise 4
        Print Courses Whose Name has atleast 4 letters
     */
    public static void PrintMoreThan4Letters(List<String> str) {
        str.stream()
                .filter(s -> s.length() >= 4)
                .forEach(System.out::println);
    }

    /*
        Exercise 5
        Print the cubes of odd numbers
     */
    public static void PrintCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    /*
        Exercise 6
        Print the number of characters in each course name
     */
    public static void PrintNumberOfCharacters(List<String> str) {
        str.stream()
                .map( s -> s + " " + s.length() )
                .forEach( System.out::println );
    }


}
