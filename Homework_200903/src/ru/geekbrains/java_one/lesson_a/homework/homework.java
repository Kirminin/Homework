package ru.geekbrains.java_one.lesson_a.homework;

public class homework {
    public static void main(String[] args){
        int a = 2;
        int b = 4;
        int c = 10;
        int d = 3;
        String name = "Вася";
        int year = 2021;
        float result = task_1(a, b, c, d);
        boolean i = task_2(c, d);
        task_3(c);
        System.out.println(task_4(name));
        task_5(year);

    }
    private static float task_1(float a, float b, float c, float d) {
        return a * (b + (c / d));

    }

    private static boolean task_2(int c, int d) {
        int sum = c + d;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void task_3(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    private static String task_4(String name) {
        return ("Привет, " + name);

    }

    private static void task_5(int year){
        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 100 == 0){
            System.out.println("Год не високосный");
        } else if (year % 4 == 0){
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
