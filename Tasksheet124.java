//Ma. Angela M. Mancera
//Task: Filtering a List of Numbers

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Tasksheet124 {

    public void PredicateCheck() {

        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);
        System.out.println("Original List: " + numbers);

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThan10 = n -> n > 10;
    
        List<Integer> positive_num = filterList(numbers, isPositive);
        System.out.println("Positive Numbers: " + positive_num);

        List<Integer> even_num = filterList(numbers, isEven);
        System.out.println("Even Numbers: " + even_num);

        List<Integer> greaterthan10_num = filterList(numbers, isGreaterThan10);
        System.out.println("Numbers Greater than 10: " + greaterthan10_num);        
    }
  
    private static List<Integer> filterList(List<Integer> numbers, Predicate<Integer> predicate) {
        return numbers.stream().filter(predicate).collect(Collectors.toList());
    }
    public static void main(String[] args) {

        Tasksheet124 task = new Tasksheet124();
        task.PredicateCheck();
    }
}
