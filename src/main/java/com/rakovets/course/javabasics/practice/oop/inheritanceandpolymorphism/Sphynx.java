package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Sphynx extends Cat {


    public Sphynx(String name) {
        super(name);
    }
    @Override
    public String purr() {
        return "Sphynx purr";
    }

    @Override
    public String mew() {
        return "Sphynx mew";
    }

    @Override
    public String mew(Person person) {
        String catAnswer;
        if (person.getHappiness() > 50) {
            catAnswer = "meeeeeew";
        } else {
            catAnswer = "mew";
        }
        return catAnswer;
    }

    @Override
    public String purr(Person person) {
        String catAnswer;
        if (person.getHappiness() > 50) {
            catAnswer = "puuuuuur";
        } else {
            catAnswer = "pur";
        }
        return catAnswer;
    }
}
