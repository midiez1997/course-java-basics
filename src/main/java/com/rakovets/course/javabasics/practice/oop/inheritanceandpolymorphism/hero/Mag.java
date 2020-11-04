package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero.Hero;

public class Mag extends Hero {
    int mageDamage = 100;

    Mag(String name) {
        super(name);
    }

    public Mag(int heroHealth, int heroDamage, int mageDamage) {
        super(heroHealth, heroDamage);
        this.mageDamage = mageDamage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Mage class" + this.name + " attacks enemy for " + mageDamage);
        enemy.takeDamage(mageDamage);
    }

    public void blessing(Hero hero) {
        heroHealth += 200;
    }
}
