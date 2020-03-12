package ru.geekbrains.java_1.lesson_3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = ' ';

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;
    private static int winCond;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static void initField(){
        fieldSizeX = 5;
        fieldSizeY = 5;
        winCond = 4;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++){
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("-------");
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты сначала Х и Y через пробел от 1 до " + fieldSizeY + " >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }while (!isValidCell(x, y) || !isEmptyCell(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        }while (!isEmptyCell(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean isFieldFull() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
// Переделать проверку победы, чтобы она не была реализована просто набором условий.
// Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества символов 4.
    private static boolean checkWin(char c) {

        for (int y = 0; y < fieldSizeY; y++) {
            int count = 0;
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == c) count++;
            }
            if (count >= winCond) return true;
        }

        for (int x = 0; x < fieldSizeX; x++) {
            int count = 0;
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[y][x] == c) count++;
            }
            if (count >= winCond) return true;
        }

        int count = 0;
        for (int i = 0; i < field.length; i++) {
            if (field [i][i] == c) count++;
            if (count >= winCond) return true;
        }

        count = 0;
        for (int i = 0; i < field.length; i++) {
            if (field [i][field.length - 1 - i] == c) count++;
            if (count >= winCond) return true;
        }

        return false;
    }

    public static void playOneRound() {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл игрок!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_AI)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isFieldFull()) {
                System.out.println("Ничья.");
                break;
            }

        }
    }

    public static void main(String[] args) {
        while (true) {
            playOneRound();
            System.out.println("Play again?");
            if (SCANNER.next().equals("no"))
                break;
        }
    }
}
