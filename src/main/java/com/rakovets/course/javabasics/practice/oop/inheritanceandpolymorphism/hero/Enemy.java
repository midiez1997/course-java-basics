package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

public class Enemy implements Mortal {
    int enemyHealth;

    Enemy(int health) {
        this.enemyHealth = health;
    }

    public int takeDamage(int damage) {
        return enemyHealth -= damage;
    }

    public void attackHero(Hero hero) {
    }

    @Override
    public boolean isAlive() {
        return enemyHealth > 0;
    }

    public void setHealth(int health) {
        this.enemyHealth = health;
    }

    public int getHealth() {
        return enemyHealth;
    }
}
