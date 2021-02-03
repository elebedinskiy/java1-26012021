package ru.geekbrains.java1;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // ...
        /**
         *1. Написать программу, которая загадывает случайное число от 0 до 9,
         * и пользователю дается 3 попытки угадать это число.
         * При каждой попытке компьютер должен сообщить больше ли указанное
         * пользователем число чем загаданное, или меньше.
         * После победы или проигрыша выводится запрос – «Повторить игру еще раз?
         * 1 – да / 0 – нет»(1 – повторить, 0 – нет).
         */
        sayHello();
        while (true){
            playTheGame(4);
            System.out.println("Повторить игру ещё раз? (1 – повторить, 0 – нет)");
            Scanner scanner = new Scanner(System.in);
            int userAnswer = getUserAnswer(0, 1);
            if (userAnswer == 0){
                System.out.println("Программа завершена.");
                break;
            } else if (userAnswer == 1){
                System.out.println("Отлично. Играем ещё раз.");
                continue;
            }
        }
    }

    static void playTheGame(int attempt){
        int hiddenNumber = createRandomNumber(10);
        System.out.println("Угадай число от 0 до 9. У тебя " + attempt + " попытки!");
        Scanner scanner = new Scanner(System.in);
        for (int i = attempt; i > 0; i--){
            int userAnswer = scanner.nextInt();
            if (userAnswer == hiddenNumber) {
                System.out.println("Ты угадал! Поздравляем!");
                return;
            } else if (userAnswer > hiddenNumber && i != 1){
                System.out.println("Загаданное число меньше. Осталось " + (i - 1) + " попыток");
            } else if (userAnswer < hiddenNumber && i != 1){
                System.out.println("Загаданное число больше. Осталось " + (i - 1) + " попыток");
            }
        }
        System.out.println("Игра окончена. Ты проиграл.");
    }

    private static int createRandomNumber(int interval) {
        Random random = new Random();
        return random.nextInt(interval);
    }

    private static void sayHello(){
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.next();
        System.out.println("Привет, " + playerName);
    }
    private static int getUserAnswer (int a, int b){
        Scanner scanner = new Scanner(System.in);
        int userAnswer;
        do {
            userAnswer = scanner.nextInt();
            if (userAnswer == a || userAnswer == b){
                break;
            }
            else {
                System.out.println("Можно ответить только " + a + " или " + b + " . Повторите ввод.");
            }
        } while (true);
        return userAnswer;
    }
}
