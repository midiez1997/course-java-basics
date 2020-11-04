package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero.Hero;

public class Warrior extends Hero {
    int warriorDamage = 50;

    public Warrior(String heroName) {
        super(heroName);
    }

    public Warrior(int heroHealth, int heroDamage, int warriorDamage) {
        super(heroHealth, heroDamage);
        this.warriorDamage = warriorDamage;
    }

    @Override
    void attackEnemy(Enemy enemy) {
        System.out.println("Warrior class " + this.name + " attacks enemy for " + warriorDamage);
        enemy.takeDamage(warriorDamage);
    }

    public void underwhelming(Enemy enemy) {
        enemy.enemyHealth -= 100;
    }
}

