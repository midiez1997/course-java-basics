package com.rakovets.course.javabasics.practice.exceptionhandling;

public class TaskOne {
    public static void main(String[] args) {
        String string = null;

        try {
            string.length();
        } catch (NullPointerException ex) {
            System.out.println(ex);
            System.out.println("NullPointerException is catched");
        }
    }
}
