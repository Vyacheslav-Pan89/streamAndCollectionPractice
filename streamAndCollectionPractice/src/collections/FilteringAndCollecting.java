package collections;
/*
Task 1: Filtering and Collecting
Create a list of integers and use the Stream API to filter out even numbers, then collect the results into a new list.

Steps:

Create a List<Integer>.
Use stream(), filter(), and collect() to get a list of odd numbers.
Print the resulting list.
 */


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringAndCollecting {

    private List<Integer> integerList;

    public FilteringAndCollecting() {
        integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
    }

    public void printOddNumber() {
        List<Integer> oddList = integerList.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        oddList.forEach(num -> System.out.println(num));
    }


}
