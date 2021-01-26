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
    }

    // Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    static float calc(float a, float b, float c, float d){
        return a * (b + (c / d));
    }
}
