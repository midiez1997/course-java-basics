package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Test;

public class CatUtilTest {

    @Test
    public void catCreationTest() {
        Cat tom = new Cat("tom");
        System.out.println(tom.getName());
        System.out.println("Tom " + tom.mew());
        System.out.println("Tom " + tom.purr());
        System.out.println(tom.purr());
        System.out.println(tom.mew());
        Siamese siam = new Siamese("siam");
        System.out.println(siam.getName());
        System.out.println(siam.mew());
        System.out.println(siam.purr());
        System.out.println(siam.purr());
        Persian persik =new Persian("persik");
        System.out.println(persik.getName());
        System.out.println(persik.mew());
        System.out.println(persik.purr());
        Sphynx egypt = new Sphynx("egypt");
        System.out.println(egypt.getName());
        System.out.println(egypt.mew());
        System.out.println(persik.purr());

        tom.setName("Jerri");
        System.out.println(tom.getName());
        siam.setName("SIAM");
        System.out.println(siam.getName());
        persik.setName("PERSYAN");
        System.out.println(persik.getName());
        egypt.setName("PYRAMID");
        System.out.println(egypt.getName());

        Person person = new Person(67);
        System.out.println(person.getHappiness());
        person.setHappiness(44);
        System.out.println(person.getHappiness());
        


    }
}
