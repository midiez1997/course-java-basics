package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String mew() { // mew()` – кот мяукает (т.е возвращает  "текст" мяуканья)
        return "mew";
    }

    public String purr() { // purr()` – кот мяукает (т.е возвращает "текст" мяуканья)
        return "purr";
    }

    public String purr(Person person) {
        return "purr";
    }

}

