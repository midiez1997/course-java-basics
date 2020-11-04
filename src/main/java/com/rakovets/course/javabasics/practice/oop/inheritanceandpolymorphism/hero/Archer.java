package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

public class Archer extends Hero {
    int archerDamage = 80;

    Archer(String name) {
        super(name);
    }

    public Archer(int heroHealth, int heroDamage, int archerDamage) {
        super(heroHealth, heroDamage);
        this.archerDamage = archerDamage;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Archer class " + this.name + " attacks enemy for " + archerDamage);
        enemy.takeDamage(archerDamage);
    }

    public void precision(int i, int i1) {
        archerDamage += 20;
    }
}

