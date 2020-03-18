package ru.geekbrains.java_1.lesson5;

public abstract class Animal {

    protected String name;
    protected double runAbility;
    protected double swimAbility;
    protected double jumpAbility;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public boolean run(double distance) {
        if (distance <= this.runAbility) {
            return true;
        }else return false;
    }

    public boolean swim(double distance) {
        if (distance <= this.swimAbility) {
            return true;
        } else return false;
    }

    public boolean jump(double height) {
        if (height <= this.jumpAbility) {
            return true;
        } else return false;
    }
}
