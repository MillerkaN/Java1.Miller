package ru.geekbrains.java_1.lesson4;

import java.util.Arrays;

public class HomeWork4 {

    public static String age = "age";
    public static String salary = "salary";

    /* 5 Создать массив из 5 сотрудников.
         С помощью цикла вывести информацию только о сотрудниках старше 40 лет; */

    public static void printAgeFortyList(Employee[] list, int isOlderThan) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getAge() >= isOlderThan) {
                System.out.println(list[i]);
            }
        }
    }

    public static void printList(Employee[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    //   6 * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    public static void addToSalary (Employee[] list, int isOlderThan, int allowanceAmount) {
        for(int i = 0; i < list.length; i++) {
            if (list[i].getAge() >= isOlderThan) {
                list[i].setSalary(list[i].getSalary() + allowanceAmount);
            }
        }
}

// 7 * Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5

    public static float doAgeArithmeticalMean(Employee[] list) {
        float arithmeticalMean = 0.0f;
        for(int i = 0; i < list.length; i++) {
            arithmeticalMean += (float)list[i].getAge();
            }
        arithmeticalMean = (arithmeticalMean / list.length);
        return arithmeticalMean;
        }

    public static float doArithmeticalMean (Employee[] list, String point) {
        float arithmeticalMean = 0.0f;
        for(int i = 0; i < list.length; i++) {
            if (point == salary) {
                arithmeticalMean += (float)list[i].getSalary();
            }
            if (point == age) {
                arithmeticalMean += (float)list[i].getAge();
            }
        }
        arithmeticalMean = (arithmeticalMean / list.length);

        return arithmeticalMean;
    }


    public static void main(String[] args){
        Employee employee1 = new Employee("Пасканен","Ассенизатор", 37, 35000);
        Employee employee3 = new Employee("Ихалайнен", "Грузчик", 25, 20000);
        Employee employee4 = new Employee("Четырелайнен", "Садовник", 40, 40000);
        Employee employee5 = new Employee("Пятилайнен", "Водитель", 47, 35000);

        //4. Вывести при помощи методов из пункта 3 ФИО и должность.
        System.out.println("Задание 4");
        System.out.println("Господин " + employee1.getSurname() + " занимает должность " + (employee1.getPosition()).toLowerCase() + ".");

        Employee[] list = new Employee [5];
        list[0] = employee1;
        list[1] = new Employee ("Ватанен", "Тракторист", 50, 50000);
        list[2] = employee3;
        list[3] = employee4;
        list[4] = employee5;

        System.out.println();
        System.out.println("Задание 5");
        printAgeFortyList(list, 40);

        System.out.println();
        System.out.println("Задание 6");
        System.out.println("Cписок всех сотрудников без учета надбавок:");
        printList(list);

        addToSalary(list, 45, 5000);
        System.out.println("\nСписок сотрудников (зарплата с учетом надбавок):");
        printList(list);

        System.out.println();
        System.out.println("Задание 7");
        System.out.println("Средний арифметический возраст: " + doAgeArithmeticalMean(list));
        System.out.println("Средняя арифметическая зарплата: " + doArithmeticalMean(list, salary) +
                "\nСредний арифметический возраст: " + doArithmeticalMean(list, age));

        System.out.println();
        System.out.println("Задание 8");
        System.out.println(employee3.getIdNum());
        System.out.println(employee1.getIdNum());
        System.out.println(list[1].getIdNum());

    }

}
