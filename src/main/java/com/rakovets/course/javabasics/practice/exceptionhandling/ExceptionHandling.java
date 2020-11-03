package com.rakovets.course.javabasics.practice.exceptionhandling;

public class ExceptionHandling {

    public static void main(String[] args) {

        // таск 1
        String s = null;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }


    }

    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }

     // таск 2
//    public static void main(String[] args) {
//
//        String[] st = new String[2];
//
//        try {
//            System.out.println(st[5]);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Такого элемента нет");
//        }
//    }



}

