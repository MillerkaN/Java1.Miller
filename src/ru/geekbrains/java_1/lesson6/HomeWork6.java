package ru.geekbrains.java_1.lesson6;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;

public class HomeWork6 {

    public static void main(String[] Args){

//       1. Создать 2 текстовых файла, примерно по 50-100 символов
//        в каждом(особого значения не имеет);

        String str1 = " Oma maa mansikka. ";
        StringBuilder sb = new StringBuilder(str1);
        int max = 100;
        int index1 = max / str1.length();
        for (int i = 0; i < (index1 - 1); i++){
             sb.append(str1);
        }

        String str2 = " Muu maa mustikka. ";
        StringBuilder sb2 = new StringBuilder(str2);
        int index2 = max / str2.length();
        for (int i = 0; i < (index2 - 1); i++){
            sb2.append(str2);
        }

        OutputStream out;

            try {
            out = new FileOutputStream("file1.txt");
            byte[] bytes = sb.toString().getBytes();
            out.write(bytes);
            out.close();
            out = new FileOutputStream("file2.txt");
            byte[] bytes2 = sb2.toString().getBytes();
            out.write(bytes2);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        2. Написать программу, «склеивающую» эти файлы, то есть вначале идет
//        текст из первого файла, потом текст из второго.
            InputStream in;
            try {
                FileInputStream fis = new FileInputStream("file1.txt");
                out = new FileOutputStream("file1.txt", true);
                int b1;
                byte[] bytes10 = "\n".getBytes();
                while ((b1 = fis.read()) != -1); //Святая корова! Как еще по-нормальному сделать перенос второго текста на новую строку???
                out.write(bytes10);
                out.flush();
                out.close();
                fis.close();
                fis = new FileInputStream("file2.txt");
                out = new FileOutputStream("file1.txt", true);
                int b;
                while ((b = fis.read()) != -1)
                    out.write (b);
                 fis.close();
                 out.flush();
                 out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

//     3. * Написать программу, которая проверяет присутствует ли указанное пользователем
//     слово в файле (работаем только с латиницей).

        String targetWord1 = "mansikka";
        String targetWord2 = "kirsikka";
        String targetWord3 = "mustikka";

        try {
            Scanner sc = new Scanner(new FileInputStream("file1.txt"));
            String s = "";
            StringBuilder sb3 = new StringBuilder(s);
            while (sc.hasNextLine()) {
                sb3.append(sc.nextLine());
            }
            System.out.println("Наш текст: \n" + sb3);
            System.out.println("содержит слово: " + targetWord1 + " - " + sb3.toString().contains(targetWord1));
            System.out.println("содержит слово: " + targetWord2 + " - " + sb3.toString().contains(targetWord2));
            System.out.println("содержит слово: " + targetWord3 + " - " + sb3.toString().contains(targetWord3));
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




        //Наставник сказал, что пользоваться сканерами и принтстримами так себе идея из-за большого потребления памяти
        // Здесь Задания 1 и 2
        /*try {
            PrintStream ps = new PrintStream(new FileOutputStream("file1.txt"));
            ps.println(sb.toString());
            ps.flush();
            ps.close();
            ps = new PrintStream(new FileOutputStream("file2.txt"));
            ps.println(sb2.toString());
            ps.flush();
            ps.close();
            ps = new PrintStream(new FileOutputStream("file1.txt", true));
            Scanner sc = new Scanner(new FileInputStream("file2.txt"));
            ps.println(sc.nextLine());
            sc.close();
            ps.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/


    }
}
