package ru.geekbains.guess_the_number;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число.");
        for(int i = 10; i <= 30; i += 10) playLevel(i);
        System.out.println("Вы выиграли!!!");
        scanner.close();
    }
    private static void playLevel(int i){
        int number = (int) (Math.random() * i);
        System.out.println("Угадайте число от 0 до " + i);
        while(true){
            int input_number = scanner.nextInt();
            if(input_number == number) {
                System.out.println("вы угадали. ");
                break;
            }else if(input_number > number) {
                System.out.println("Загаданное число меньше. ");
            }else {
                System.out.println("Загаданное число больше. ");
            }
        }

    }
}
