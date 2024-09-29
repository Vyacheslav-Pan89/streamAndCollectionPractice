package collections;/*
Task 6: Parallel Processing
Using a large list of integers, demonstrate how to find the sum of the elements using both sequential and parallel streams.

Steps:

Create a large List<Integer>.
Calculate the sum using a sequential stream.
Calculate the sum using a parallel stream.
Print both results and compare the performance (optionally using System.nanoTime()).
 */

import java.util.List;
import java.util.stream.IntStream;

public class ParallelProcessing {
    private final List<Integer> integerList;

    public ParallelProcessing() {
        integerList = IntStream
                .rangeClosed(1, 999999)
                .boxed()
                .toList();
    }

    public void calculateSumUsingSequentialStream() {
        long timeStart = System.currentTimeMillis();
        long sum = integerList.stream().reduce(0, (a, b) -> a + b);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Calculate the sum using a sequential stream. Sum = " + sum);
        System.out.println("Time taken to calculate: " + (timeEnd - timeStart) + " ms.");
    }

    public void calculateSumUsingParallelStream() {
        long timeStart = System.currentTimeMillis();
        long sum = integerList.parallelStream().reduce(0, (a, b) -> a + b);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Calculate the sum using a parallel stream. Sum = " + sum);
        System.out.println("Time taken to calculate: " + (timeEnd - timeStart) + " ms.");
    }
}
