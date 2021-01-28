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
    }
}
