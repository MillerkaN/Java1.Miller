package ru.geekbrains.java_1.lesson5;

public class HomeWork5 {

    public static void checkRunning(int i, Animal[] zoo, double distance) {
        if (zoo[i].run(distance)) {
            System.out.println(zoo[i].name + " смог пробежать");
        }else System.out.println(zoo[i].name + " не смог так много пробежать");
    }

    public static void checkJumping(int i, Animal[] zoo, double distance) {
        if (zoo[i].jump(distance)) {
            System.out.println(zoo[i].name + " смог прыгнуть");
        }else System.out.println(zoo[i].name + " не смог так высоко прыгнуть");
    }

    public static void checkSwimming(int i, Animal[] zoo, double distance) {
        if (zoo[i].swim(distance)) {
            System.out.println(zoo[i].name + " смог проплыть");
        }else System.out.println(zoo[i].name + " не смог проплыть");
    }

    public static void main(String[] args) {

        Cat cat = new Cat ("Баксик");
        Bird bird = new Bird("Кеша");
        Horse horse = new Horse("Сивка-бурка");
        Pug pug = new Pug("Курносый");
        Hound hound = new Hound("Баскервилей");

        Animal[] zoo = {cat, bird, horse, pug, hound};

        double runDistance = 450.0;
        double jumpDistance = 1;
        double swimDistance = 9.0;


        for (int i = 0; i < zoo.length; i++) {
            checkRunning(i, zoo, runDistance);
            checkJumping(i, zoo, jumpDistance);
            checkSwimming(i, zoo, swimDistance);
            System.out.println();
        }


    }

}

