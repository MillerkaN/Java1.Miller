package ru.geekbrains.java_1.lesson5;

public class Cat extends Animal {

    public Cat (String name) {
        super(name);
        super.runAbility = 200;
        super.jumpAbility = 2;
    }

    @Override
    public boolean swim(double distance) {
        return false;
    }
}
