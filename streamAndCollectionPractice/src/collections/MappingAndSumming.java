package collections;/*
Task 2: Mapping and Summing
Given a list of strings representing names, create a new list that contains the lengths of each name,
and then calculate the total length of all names.

Steps:

Create a List<String> with several names.
Use stream(), map(), and reduce() to find the total length of the names.
Print the total length.
 */

import java.util.Arrays;
import java.util.List;

public class MappingAndSumming {
    private List<String> nameList;

    public MappingAndSumming(){
        nameList = Arrays.asList("John", "Mike", "Slava", "Antony", "Anna", "Victor", "Sara", "Jack", "Biggs");
    }

    public void reduceToTotalLength(){
        int totalLength = nameList.stream().map(name -> name.length()).reduce(0, (a, n) -> a + n);
        System.out.println("Total length: " + totalLength);
    }
}
