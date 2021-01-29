package ru.geekbrains.java1;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr1)); // вывод значений массива в строку
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == 0){
                arr1[i] = 1;
            }
            else if (arr1[i] == 1){
                arr1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new int[8];
        System.out.println(Arrays.toString(arr2));
        for(int i = 0, j = 0; i < arr2.length; i++, j+=3){
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr3));
        for(int i = 0; i< arr3.length; i++){
            if (arr3[i] < 6){
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));

        int arrSize = 5;
        int[][] arr4 = new int[arrSize][arrSize];
        for (int i = 0, j = 0; i < arr4.length; i++, j++){
            arr4[i][j] = 1;
        }
        printArray(arr4); // вызов метод вывода двумерного массива

        // 5.Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] arr5 = {10, 4, 3, 8, 2, 12, 4};
        System.out.println(Arrays.toString(arr5));
        int max = arr5[0], min = arr5[0];
        for (int i = 1; i < arr5.length; i++){
            if (max < arr5[i]) {
                max = arr5[i];
            }
            if (min > arr5[i]) {
                min = arr5[i];
            }
        }
        System.out.println("Max: " + max + ", Min: " +  min);

        int[] arr61 = {2, 2, 2, 1, 2, 2, 10, 1};
        int[] arr62 = {2, 2, 2, 1, 2, 2, 10, 2};
        int[] arr63 = {1, 1, 1, 3};
        int[] arr64 = {1, 1, 1, 1, 1, 1, 1, 8};
        System.out.println(checkBalance(arr61)); // true
        System.out.println(checkBalance(arr62)); // false
        System.out.println(checkBalance(arr63)); // true
        System.out.println(checkBalance(arr64)); // false

        /**
         * 7.Написать метод, которому на вход подается одномерный массив и число n
         * (может быть положительным, или отрицательным), при этом метод должен сместить все
         * элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
         */
        int[] arr71 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 11;
        int[] arr72 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n2 = -1;
        System.out.println(Arrays.toString(arr71));
        moveArray(arr71, n1);
        System.out.println(Arrays.toString(arr71));
        System.out.println(Arrays.toString(arr72));
        moveArray(arr72, n2);
        System.out.println(Arrays.toString(arr72));

    }

    static void moveArray(int[] array, int n) {
        if (n > 0){
            for (int i = 0; i < n; i++){
                int buffer = array[array.length - 1]; // запомним последний элемент массива
                for (int j = 1; j < array.length; j++){
                    array[array.length - j] = array[array.length - 1 - j];
                    if (j == array.length - 1){
                        array[0] = buffer;
                    }

                }
            }
        }
        else if (n < 0){
            for (int i = 0; i > n; i--){
                int buffer = array[0]; // запомним первый элемент массива
                for (int j = 0; j < array.length - 1; j++){
                    array[j] = array[j + 1];
                    if (j == array.length - 2){
                        array[array.length - 1] = buffer;
                    }
                }
            }
        }
    }

    static void printArray (int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static boolean checkBalance(int[] array){
        int sum1 = array[0];
        int sum2 = 0;

        // посчитали сумму элементов правой части массива кроме элемента 0
        for (int i = 1; i < array.length; i++){
            sum2 += array[i];
        }

        // сравниваем левую и правую часть
        for (int i = 1; i < array.length; i++){
            if (sum1 == sum2){
                return true;
            }
            // если части не равны, то к левой сумме прибавить один элемент, а от правой отнять
            else {
                sum1 += array[i];
                sum2 -= array[i];
            }
        }

        return false;
    }
}
