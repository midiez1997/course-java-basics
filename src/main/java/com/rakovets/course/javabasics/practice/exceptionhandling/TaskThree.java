package com.rakovets.course.javabasics.practice.exceptionhandling;

public class TaskThree {

    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }

    public static void throwCustomException() throws CustomException {
        throw new CustomException();

    }
}
