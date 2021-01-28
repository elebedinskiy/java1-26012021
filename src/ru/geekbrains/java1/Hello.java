package ru.geekbrains.java1;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr)); // вывод значений массива в строку
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                arr[i] = 1;
            }
            else if (arr[i] == 1){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
