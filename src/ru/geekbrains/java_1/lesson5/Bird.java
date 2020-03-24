package ru.geekbrains.java_1.lesson5;

public class Bird extends Animal {

    public Bird (String name) {
        super(name);
        super.runAbility = 5;
        super.jumpAbility = 0.2;
    }

    @Override
    public boolean swim(double distance) {
        return false;
    }
}

