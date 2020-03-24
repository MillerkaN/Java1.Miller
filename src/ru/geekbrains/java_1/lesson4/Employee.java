package ru.geekbrains.java_1.lesson4;

import java.util.Arrays;

/*  1. Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;*/
public class Employee {
    private String surname;
    private String position;
    private int age;
    private int salary;
    private int idNum;
    private static int currentIdNum = 1;

    @Override
    public String toString()
    {
        return "Фамилия: " + this.surname + ", Должность: " + this.position + ", Возраст: "+ this.age + ", Заработная плата: " + this.salary + " RUB";
    }

//3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIdNum() {
        return idNum;
    }

    public Employee() {
    }

//   2. Конструктор класса должен заполнять эти поля при создании объекта;
//   8 *** Продумать конструктор таким образом, чтобы при создании
//   каждому сотруднику присваивался личный уникальный идентификационный порядковый номер */
        public Employee(String surname, String position, int age, int salary) {
            this.idNum = currentIdNum++;
            this.surname = surname;
            this.position = position;
            this.age = age;
            this.salary = salary;
        }
}
