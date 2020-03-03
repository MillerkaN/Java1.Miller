package ru.geekbrains.java_1.lesson_1;

public class HomeWork1Millerka {
    /*Написать метод вычисляющий выражение a * (b + (c / d))
    и возвращающий результат с плавающей точкой,
    где a, b, c, d – целочисленные входные параметры этого метода;
     */
    private static float number(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    /* Написать метод, принимающий на вход два целых числа,
    и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false
     */
    private static boolean checkNumSum(int x, int y){
        boolean resultCheckNum;
        if ((x + y) >= 10 && (x + y) <= 20) {
            resultCheckNum = true;
        }else{
            resultCheckNum = false;
        }
        return resultCheckNum;
    }

    /* Написать метод, которому в качестве параметра передается целое число,
    метод должен проверить положительное ли число передали, или отрицательное.
    Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
     */
    private static void checkNum(int x){
        if (x >= 0){
            System.out.println("Число " + x + " является положительным.");
        }else {
            System.out.println("Число " + x + " является отрицательным.");
        }
    }

    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вернуть приветственное сообщение «Привет, переданное_имя!»;
    Вывести приветствие в консоль.
     */
    private static String sayHelloName(String name){
        return ("Привет, " + name + "!");
    }

    /*Написать метод, который определяет, является ли год високосным.
    Каждый 4-й год является високосным, кроме каждого 100-го,
    при этом каждый 400-й – високосный.
    Для проверки работы вывести результаты работы метода в консоль
     */
    private static void checkYear(int year){
        if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0)){
            System.out.println(year + " год является високосным.");
        }else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void main(String [] args){

        System.out.println(number(2,3,8, 4));
        System.out.println();

        System.out.println(checkNumSum(2, 3));
        System.out.println(checkNumSum(5, 5));
        System.out.println(checkNumSum(6, 8));
        System.out.println(checkNumSum(10, 10));
        System.out.println(checkNumSum(15, 16));
        System.out.println();

        checkNum(1);
        checkNum(-100);
        checkNum(0);
        System.out.println();

        System.out.println(sayHelloName("Наташка"));
        System.out.println();

        checkYear(4);
        checkYear(400);
        checkYear(100);
        checkYear(300);
        checkYear(234);
        checkYear(2020);
        checkYear(800);
        checkYear(2100);
    }
}
