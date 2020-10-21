package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Siamese extends  Cat {
    public Siamese(String name) {
        super(name);
    }
    @Override
    public String purr() {
        return "purrSiamese";
    }
    @Override
    public String mew() {
        return "mewSiamese";
    }
}
