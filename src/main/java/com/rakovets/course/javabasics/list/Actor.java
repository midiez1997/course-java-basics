package com.rakovets.course.javabasics.list;

public class Actor {

    private String firstname;
    private String lastName;
    private int fee;
    private int age;

    public Actor(String firstname, String lastName, int fee, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.fee = fee;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
