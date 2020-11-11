package com.rakovets.course.javabasics.practice.exceptionhandling;

public class TaskFive {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException ex) {
            throw new CustomRuntimeException(ex.getMessage());
        }
    }
}
