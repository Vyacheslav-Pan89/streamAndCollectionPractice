package collections;/*
Task 7: Custom Collector
Create a custom collector that collects strings into a single string, separated by commas.

Steps:

Create a List<String>.
Use stream() and your custom collector to join the strings.
Print the resulting string.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomCollector {

    public final List<String> fruitList;

    public CustomCollector(){
        fruitList = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");
    }

    public void customCollector(){
        String result = fruitList.stream().collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
