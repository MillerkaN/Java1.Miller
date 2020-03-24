package ru.geekbrains.java_1.lesson_2;

import java.util.Arrays;

public class HomeWork2 {

    /*1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;*/

        private static int[] change(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1 || arr[i] == 0) {
                    arr[i] = (arr[i] == 0) ? 1 : 0;
                } else {
                    System.out.print("Ой! Этот массив содержит не только 1 и 0! нужно чекнуть и преписать его! ");
                }
            }
            return arr;
        }

    /*2 Задать пустой целочисленный массив размером 8. Написать метод,
    который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;*/

        private static int[] addNum(int[] arr) {
            int x = 1;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = x;
                x = (x + 3);
            }
            return arr;
        }


    /*3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
    принимающий на вход массив и умножающий числа меньше 6 на 2;*/

        private static int[] multiply(int arr[]) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = (arr[i] < 6) ? (arr[i] * 2) : arr[i];
            }
            return arr;
        }

        /*4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;*/

        private static int max(int arr[]) {
            int max = 0;
            for(int i = 0; i < arr.length; i++) {
                max = (arr[i] > max) ? arr[i] : max;
            }
            return max;
        }

        private static int min(int arr[]) {
            int min = max(arr);
            for(int i = 0; i < arr.length; i++) {
                min = (arr[i] < min) ? arr[i] : min;
            }
            return min;
        }

    /*5 * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    заполнить его диагональные элементы единицами, используя цикл(ы);*/

        private static int[][] printCross(int[][] arr) {
            for (int y = 0; y < arr.length; y++) {
                for (int x = 0; x < arr[y].length; x++) {
                    if (y == x) {
                        arr[y][x] = 1;
                    } else if (x == (arr[y].length - 1 - y)) {
                        arr[y][x] = 1;
                    } else {
                        arr[y][x] = 0;
                    }
                    System.out.print(arr[y][x] + "  ");
                }
                System.out.println();
            }
            return arr;
        }


    /*6 ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место, в котором сумма левой и
    правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
    checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
    Абстрактная граница показана символами ||, эти символы в массив не входят. */

        private static int sum(int[] arr) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            return sum;
        }
        private static boolean checkBalance(int[] arr) {
            boolean res = true;
            int leftSide = 0;
            for (int i = 0; i < arr.length; i++) {
                leftSide = leftSide + arr[i];
                res = (leftSide == (sum(arr) - leftSide)) ? true : false;
                if (res == true){
                    break;
                }
            }
            return res;
        }


        public static void main(String args[]) {
            /*Задание 1*/
            int[] arr11 = {1, 1, 1, 0, 1};
            System.out.println("Задание 1.\nИзмененный массив: " + Arrays.toString(change(arr11)));

            int[] arr12 = {0, 1, 3};
            System.out.println(Arrays.toString(change(arr12)));
            System.out.println();

            /*Задание 2*/
            int[] arr21 = new int[8];
            System.out.println("Задание 2. Вот массив: " + Arrays.toString(addNum(arr21)));
            System.out.println();

            /*Задание 3*/
            int[] arr31 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            System.out.println("Задание 3. Что было: " + Arrays.toString(arr31) +
                    ". \nА вот после умножения: " + Arrays.toString(multiply(arr31)) + ".");
            System.out.println();

            /*Задание 4*/
            int[] arr41 = { 1, 2, 3, -8, 57, 6, 0, 8, 9, 10 };
            System.out.println("Задание 4. \nМассив " + Arrays.toString(arr41) + "\nМаксимальное число в заданном массиве это " + max(arr41) +
                    ".\nМинимальное число в заданном массиве это " + min(arr41) + ".");
            System.out.println();

            /*Задание 5*/
            int[][] arr51 = new int[7][7];
            System.out.println("Задание 5.");
            printCross(arr51);
            System.out.println();

            /*Задание 6*/
            int[] arr61 = {1, 1, 1, 2, 1};
            int[] arr62 = {2, 1, 1, 2, 1};
            int[] arr63 = {10, 1, 2, 3, 4};
            System.out.println("Задание 6.");
            System.out.println(checkBalance(arr61));
            System.out.println(checkBalance(arr62));
            System.out.println(checkBalance(arr63));

        }
    }


