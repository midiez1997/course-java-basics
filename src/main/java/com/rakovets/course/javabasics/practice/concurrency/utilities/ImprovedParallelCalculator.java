package com.rakovets.course.javabasics.practice.concurrency.utilities;

import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ImprovedParallelCalculator {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);

        List<Future<Long>> tasks = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
         MyCallable mc = new MyCallable();
            Future<Long> submit = es.submit(mc);
            tasks.add(submit);
        }
        for(Future<Long> f : tasks) {
            f.get();
        }

        System.out.println("Finish");
        es.shutdown();

    }

}

class MyCallable implements Callable<Long> {

    @Override
    public Long call() {
        try {
        System.out.println("Started: " + Thread.currentThread().getId());
        Thread.sleep((1000 + Math.round(Math.random() * 5000)));
        System.out.println("Finished: " + Thread.currentThread().getId());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return Thread.currentThread().getId();
    }
}
