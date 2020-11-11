package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.io.FileNotFoundException;

public class TaskSeven {
    public static void main(String[] args) {
        final int min = 1;
        final int max = 2;
        int rnd = rnd(min, max);
        try {
            if (rnd == 1) {
                System.out.println("without exception");
            } else {
                System.out.println("with exception");
                throw new FileNotFoundException();
            }

        } catch (FileNotFoundException ex) {
//            System.out.println("FileNotFoundException is caught");
            throw new RuntimeException();
        } finally {
            System.out.println("finally operation");
        }
    }

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
