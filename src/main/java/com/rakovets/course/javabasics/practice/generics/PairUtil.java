package com.rakovets.course.javabasics.practice.generics;

public class PairUtil {

    public static Pair swap(Pair pair) {
        return new Pair(pair.getValue2(), pair.getValue1());
    }

    public static void main(String[] args) {
        Pair pair = new Pair(3, 7);
        swap(pair);
    }
}
