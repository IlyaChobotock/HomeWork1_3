package ru.geekbrains.ageev.hw1_3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1_3 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Здесь разбирался с работой чтения и печати вводимых в консоль данных

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int no = scanner.nextInt();
        System.out.printf("Вы ввели число %d\n", no);

        scanner.nextLine();

        System.out.println("Введите строку, пустая допускается: ");
        String str1 = scanner.nextLine();
        System.out.printf("Вы ввели строку \"%s\"\n", str1);

        System.out.println("Введите слово, пустое поле НЕ допускается: ");
        String str2 = scanner.next();
        System.out.printf("Вы ввели строку \"%s\"\n", str2);

        scanner.nextLine();

        System.out.println("Введите строку, пустая допускается: ");
        String str3 = scanner.nextLine();
        System.out.printf("Вы ввели строку \"%s\"\n", str3);

        */

        //С нуля по лекции писал основу программы и первую подпрограмму

        boolean flag = true;

        System.out.println("========================================================================");
        System.out.println("Выберите программу:");
        while (flag){
            System.out.println("1 - Программа \"Подсчет суммы нечетных положительных чисел\"");
            System.out.println("2 - Игра \"Угадай число от 0 до 9\"");
            System.out.println("3 - Задача 3");
            System.out.println("0 - Выход из программы");
            System.out.println("Введите:");
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                scanner.nextLine();
                switch (number){
                    case 0:
                        System.out.println("========================================================================");
                        System.out.println("Завершение работы программы");
                        System.out.println("========================================================================");
                        flag = false;
                        break;
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    case 3:
                        task3();
                        break;
                    default:
                        System.out.println("Не удалось определить блок подпрограммы. Повторите попытку ввода");
                }
            }
            else {
                System.out.println("Вы ввели некорректное число\nПожалуйста, повторите попытку ввода");
                scanner.nextLine();
            }
        }

    }

    static void task1(){
        System.out.println("========================================================================");
        System.out.println("Программа 1. Подсчет суммы нечетных положительных чисел");
        System.out.println("========================================================================");
        System.out.println("Вводите целые числа (0 - завершение ввода):");

        int sum = 0;
        int counter = 0;
        boolean isNumber;
        int number = 0;
        do {
            counter++;
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                number = scanner.nextInt();
                scanner.nextLine();
                if (number > 0 && !isEven(number)){
                    sum += number;
                }
            } else {
                System.out.println("Вы ввели некорректное число\nПожалуйста, повторите попытку ввода");
                scanner.nextLine();
            }
        }
        while (!(isNumber && number == 0));

        System.out.println("----------------------------------Итог----------------------------------");
        System.out.printf("Сумма нечетных положительных чисел: %d;\nКоличество попыток ввода: %d\n", sum, counter);
        System.out.println("Завершение работы программы \"Подсчет суммы нечетных положительных чисел\"");
        System.out.println("========================================================================");
        System.out.println();
    }

    static boolean isEven(int n){
        return n % 2 == 0;
    }

    static void task2(){
        System.out.println("========================================================================");
        System.out.println("Игра 2. Угадай число от 0 до 9 за три попытки");
        System.out.println("========================================================================");
        System.out.println("Вводите целые числа:");

        Random r = new Random();
        int random = r.nextInt(10);
        int counter = 0;
        boolean isNumber;
        int number;
        do {
            System.out.print("Введите число: ");
            isNumber = scanner.hasNextInt();
            if (isNumber){
                number = scanner.nextInt();
                scanner.nextLine();
                if (number >= 0 && number < random){
                    counter++;
                    System.out.println("Загаданное число больше!");
                } else if (number > random && number <= 9) {
                    counter++;
                    System.out.println("Загаданное число меньше!");
                } else if (number == random) {
                    System.out.println("========================================================================");
                    System.out.println("Вы угадали!");
                    break;
                }
            } else {
                System.out.println("Вы ввели некорректное число\nПожалуйста, повторите попытку ввода");
                scanner.nextLine();
            }
        }
        while (!(counter == 3));
        if (counter == 3) {
            System.out.println("========================================================================");
            System.out.println("К сожалению, у Вас больше не осталось попыток");
            System.out.printf("Правильный ответ: %d\n", random);
        }

        System.out.println("Завершение Игры \"Угадай число от 0 до 9\"");
        System.out.println("========================================================================");
        System.out.println();
    }

    static void task3(){
        System.out.println("========================================================================");
        System.out.println("Заглушка...");
        System.out.println("========================================================================");
    }
}
