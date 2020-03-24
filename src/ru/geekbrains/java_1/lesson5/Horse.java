package ru.geekbrains.java_1.lesson5;

public class Horse extends Animal {

    public Horse(String name) {
        super(name);
        super.runAbility = 1500;
        super.swimAbility = 100;
        super.jumpAbility = 3;
    }
}
