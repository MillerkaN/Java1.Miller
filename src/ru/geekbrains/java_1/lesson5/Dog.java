package ru.geekbrains.java_1.lesson5;

public abstract class Dog extends Animal{

    public Dog (String name) {
        super(name);
        super.swimAbility = 10.0;
    }
}
