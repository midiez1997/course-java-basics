package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

public class Zombie extends Enemy {

    int zombieDamage = 20;
    int timesOfRevivalOpportunity = 5;

    Zombie(int enemyHealth) {
        super(enemyHealth);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(zombieDamage);
        System.out.println("Zombie attacked Hero for " + zombieDamage);
    }

    public void reincarnation() {

        if (/*enemyHealth <= 0 && */this.timesOfRevivalOpportunity > 0) {
            this.timesOfRevivalOpportunity--;
            this.setHealth(51);
        }
    }

    public void setDamage(int damage) {
        this.zombieDamage = damage;
    }
}
