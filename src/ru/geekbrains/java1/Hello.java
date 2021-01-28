package ru.geekbrains.java1;

import java.lang.reflect.Array;
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

    }
    static void printArray (int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
