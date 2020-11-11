package com.rakovets.course.javabasics.practice.exceptionhandling;

public class TaskFour {
    public static void main(String[] args) {
        try {
            throwCustomRuntimeException();
        } catch (CustomRuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void throwCustomRuntimeException() {
        throw new CustomRuntimeException();

    }
}
