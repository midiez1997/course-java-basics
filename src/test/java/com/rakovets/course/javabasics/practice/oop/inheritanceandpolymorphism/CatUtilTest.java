package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Test;

public class CatUtilTest {

    @Test
    public void catCreationTest() {
        Cat tom = new Cat("tom");
        System.out.println(tom.mew());
        Sphynx egypt = new Sphynx("egypt");
        System.out.println(egypt.mew());

    }
}
