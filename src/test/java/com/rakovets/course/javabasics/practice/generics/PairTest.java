package com.rakovets.course.javabasics.practice.generics;

public class PairTest {

    public static void main(String[] args) {
    Pair pair = new Pair(2,4);
        System.out.println(pair.getValue1());
        System.out.println(pair.getValue2());

    pair.setValue1(3);
    pair.setValue2(5);
    System.out.println(pair.getValue1());
    System.out.println( pair.getValue2());
    }

}
