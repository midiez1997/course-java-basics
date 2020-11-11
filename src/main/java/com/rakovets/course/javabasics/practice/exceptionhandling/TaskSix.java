package com.rakovets.course.javabasics.practice.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TaskSix {

    public static void main(String[] args) {
        final int min = 1;
        final int max = 3;

        try {
            rnd(min,max);
        } catch (IOException ex) {
            System.out.println("IOException or FileNotFoundException is caught" );
        } catch (NullPointerException ex) {
            System.out.println("NullPointerException is caught" );
        }

        System.out.println("all exceptions handled");

    }

    public static void rnd(int min, int max) throws IOException {
        max -= min;
        int rnd = (int) (Math.random() * ++max) + min;
        if( rnd == 1) {
            throw new IOException();
        } else if (rnd == 2) {
            throw new FileNotFoundException();
        } else {
            throw new NullPointerException();
        }
    }
}

