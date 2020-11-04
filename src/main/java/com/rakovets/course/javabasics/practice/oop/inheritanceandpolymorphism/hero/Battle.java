package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.hero;

public class Battle {
    public static void main(String[] args) {
        Hero warrior = new Warrior("a");
        warrior.setHealth(1000);
        Zombie zombie = new Zombie(200);
        for (int i = 1; warrior.isAlive(); i++) {
            if (zombie.isAlive() == false) {
                ((Zombie) zombie).reincarnation();
                System.out.println("zombie reincarnated");
            }
            warrior.attackEnemy(zombie);
            if (zombie.enemyHealth < (-50)) {
                System.out.println("zombie is down");
                break;
            }
            zombie.attackHero(warrior);
            System.out.println("zombie HP: " + zombie.enemyHealth + ", Hero HP: " + warrior.heroHealth);

        }
        if (warrior.isAlive()){
            System.out.println("Hero won");
        }else{
            System.out.println("Hero is down");
        }
    }
}
