package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Test;

public class CatUtilTest {

    @Test
    public void catCreationTest() {


        Cat siam = new Siamese("siam");
        System.out.println(siam.getName());
        System.out.println(siam.mew());
        System.out.println(siam.purr());

        Cat persik =new Persian("persik");
        System.out.println(persik.getName());
        System.out.println(persik.mew());
        System.out.println(persik.purr());

        Cat egypt = new Sphynx("egypt");
        System.out.println(egypt.getName());
        System.out.println(egypt.mew());
        System.out.println(persik.purr());

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

        System.out.println(persik.mew(person));
        System.out.println(persik.purr(person));
        System.out.println(siam.mew(person));
        System.out.println(siam.purr(person));
        System.out.println(egypt.mew(person));
        System.out.println(egypt.purr(person));
        


    }
}
