package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

abstract public class Hero implements Mortal {
    public String name;
    public int heroHealth;
    public int heroDamage;

    Hero(String heroName) {
        this.name = heroName;
    }

    public String getName() {
        return name;
    }

    Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int takeDamage(int damage) {
        return heroHealth = heroHealth - damage;
    }

    public int getHealth() {
        return heroHealth;
    }

    abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return heroHealth > 0;
    }

    public boolean setHealth(int health) {
        this.heroHealth = health;
        return false;
    }
}
