package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Persian extends Cat {
    public Persian(String name) {
        super(name);
    }
    @Override
    public String purr() {
        return "purrPersian";
    }
    @Override
    public String mew() {
        return "mewPersian";
    }
}
