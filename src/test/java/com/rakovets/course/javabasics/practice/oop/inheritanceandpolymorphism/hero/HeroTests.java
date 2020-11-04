package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Cat;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.Siamese;
import org.junit.jupiter.api.Test;

public class HeroTests {

    @Test
    public void heroCreationTest() {
        Hero hero = new Hero("John") {
            @Override
            void attackEnemy(Enemy enemy) {

            }
        };
        Hero hero1 = new Hero(30, 70) {
            @Override
            void attackEnemy(Enemy enemy) {

            }
        };
        System.out.println(hero.getName());
        System.out.println(hero1.getHealth());
        System.out.println(hero1.setHealth(40));

        Archer archer = new Archer("Archi");
        Archer archer1 = new Archer(23,70,55);
        System.out.println(archer.getName());
        System.out.println(archer1.getHealth());
    }
}
