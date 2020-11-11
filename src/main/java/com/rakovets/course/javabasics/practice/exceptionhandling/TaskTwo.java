package com.rakovets.course.javabasics.practice.exceptionhandling;

public class TaskTwo {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.out.println("ArrayIndexOutOfBoundsException is caught");
        }
    }
}
