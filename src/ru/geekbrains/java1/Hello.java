package ru.geekbrains.java1;

public class Hello {
    public static void main(String[] args) {

        // Существует 8 примитивных типов данных

        byte varByte = -120; // от -128 до 127
        short varShort = 12442; // от -32768 до 32767
        int varInt = 1000; // от -2147483648 до 2147483647
        long varLong = 200000L; // от -9223372036854775808 до 9223372036854775807
        float varFloat = 12.23f;
        double varDouble = -123.123;
        char varChar1 = '*'; // от '\u0000' или 0 до '\uffff' или 65,535
        char varChar2 = '\u2242'; // до '\uffff' или 65,535
        boolean varBoolean = false; // false, true

        float a = 3, b = 5, c = 7, d = 9;
        System.out.println("a = " + a + "; b = " + b + "; c = " + c + "; d = " + d);
        System.out.println("a * (b + (c / d)) = " + calc(a, b, c, d));

        System.out.println("a = " + a + "; b = " + b + " Сумма a + b лежит между 10 и 20? " + isInIntervalFrom10to20(a, b));
        System.out.println("b = " + b + "; c = " + c + " Сумма b + c лежит между 10 и 20? " + isInIntervalFrom10to20(b, c));

        System.out.println(isPositiveNumber(-5)); // false
        System.out.println(isPositiveNumber(5)); // true
        System.out.println(isNegativeNumber(-2)); // true
        System.out.println(isNegativeNumber(2)); // false

        sayHello("Алексей");
        sayHello("Антон");

        System.out.println();
        System.out.println("2020 год високоный? " + isLeapYear(2020));
        System.out.println("2019 год високоный? " + isLeapYear(2019));
        System.out.println("2018 год високоный? " + isLeapYear(2018));
        System.out.println("2017 год високоный? " + isLeapYear(2017));
        System.out.println("2016 год високоный? " + isLeapYear(2016));

    }

    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean isInIntervalFrom10to20 (float a, float b){
        float sum = a + b;
        return sum > 10 && sum < 20;
    }

    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    static boolean isPositiveNumber (int num){
        if (num >= 0) {
            System.out.println("Число больше или равно нулю");
            return true;
        }
        return false;
    }

    // Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    static boolean isNegativeNumber (int num){
        return num < 0;
    }

    // Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void sayHello (String name){
        System.out.println("Привет, " + name + "!");
    }

    // Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    static boolean isLeapYear (int year){
        if (year%4 == 0) {
            if (year % 100 == 0 || year % 400 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

}
