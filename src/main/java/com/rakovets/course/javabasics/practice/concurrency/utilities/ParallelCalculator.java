package com.rakovets.course.javabasics.practice.concurrency.utilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelCalculator extends Thread implements Runnable {
    private Integer[] array;
    private int max;
    private static List<ArrayMax> result = Collections.synchronizedList(new ArrayList<>());

    public ParallelCalculator(Integer[] array) {
        this.array = array;
    }

    public static List<ArrayMax> calcMax(List<Integer[]> list, int numberOfThreads) {
        ExecutorService executor = Executors.newFixedThreadPool(numberOfThreads);
        Runnable[] calculators = new ParallelCalculator[numberOfThreads];
        int threads = 0;
        for (int i = 0; i < numberOfThreads - 10; i++) {
            calculators[threads] = new ParallelCalculator(list.get(i));
            executor.execute(calculators[i]);
            executor.shutdown();
            threads++;
            if (threads == numberOfThreads) {
                threads = 0;
            }
        }

        ArrayList<ArrayMax> res = new ArrayList<>();
        res.addAll(result);
        return res;
    }

    public void run() {
        Integer[] newArray = array.clone();
        Arrays.sort(newArray);
        max = newArray[newArray.length - 1];
        result.add(new ArrayMax(array, max));
    }

}
