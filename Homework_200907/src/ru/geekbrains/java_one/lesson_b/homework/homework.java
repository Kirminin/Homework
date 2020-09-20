package ru.geekbrains.java_one.lesson_b.homework;

import java.util.Arrays;

public class homework {
    public static void main(String[] args) {
        int[]arr =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(task_1(arr)));
        int[]arr2 = new int[8];
        System.out.println(Arrays.toString(task_2(arr2)));
        int[]arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(task_3(arr3)));
        int max = max(arr3);
        System.out.println("Максимальное значение:" + max);
        int min = min(arr3);
        System.out.println("Минимальное значение:" + min);
       
    }
// первое задание
    private static int[] task_1(int[]arr) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
            arr[i] = 0;
            } else {
                arr[i] = 1;
            }

        }
        return arr;
    }
// второе задание
    private static int[] task_2(int[]arr2) {
        arr2[0] = 1;
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        return arr2;
    }
// третье задание
    private static int[] task_3(int[]arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        return arr3;
    }
// четвертое задание
    private static int max(int[]arr3) {
        int maxValue = arr3[5];
        for(int i = 1; i < arr3.length; i++) {
            if (arr3[i] > maxValue) {
                maxValue = arr3[i];
            }
        }
        return maxValue;
    }

    private static int min(int[]arr3) {
        int minValue = arr3[0];
        for(int i = 1; i < arr3.length; i++) {
            if (arr3[i] < minValue) {
                minValue = arr3[i];
            }
        }
        return minValue;
    }
}
