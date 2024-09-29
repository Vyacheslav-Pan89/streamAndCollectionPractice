package collections;/*
Task 8: Nested Collection Processing
Given a list of Map<String, List<Integer>> (where the key is a category and the value is a list of scores), find the average score for each category.

Steps:

Create a list of maps.
Use the Stream API to calculate the average score for each category.
Print the average scores.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NestedCollectionProcessing {
    private final List<Map<String, List<Integer>>> scoreMap;

    public NestedCollectionProcessing() {

        Map<String, List<Integer>> map1 = new HashMap<>();

        map1.put("Math", Arrays.asList(9, 8, 4, 7));
        map1.put("Chemistry", Arrays.asList(5, 6, 3, 9));
        map1.put("Sports", Arrays.asList(7, 9, 6, 4, 8));

        scoreMap = List.of(map1);

    }

    public void calculateAverageScore() {

        Map<String, Double> averageScores = scoreMap.stream().flatMap(map -> map.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.flatMapping(entry -> entry.getValue().stream(),
                                Collectors.averagingInt(Integer::intValue))));

        averageScores.forEach((category, avgScore)
                -> System.out.println("Category: " + category + ", Average Score: " + avgScore));
    }

}
