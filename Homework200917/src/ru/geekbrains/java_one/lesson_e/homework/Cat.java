package ru.geekbrains.java_one.lesson_e.homework;

public class Cat extends Animal {
    int runlimit = 200;
    int jumplimit = 2;

    Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void run(int a) {
        if (a < this.runlimit) {
            System.out.println("Cat " + name + " run");
        } else {
            System.out.println("Cat " + name + " did not run");
        }
    }

    @Override
    void swim(int b) {
        if (b > 0) {
            System.out.println("Cat " + name + " can't swim");
        }
    }

    @Override
    void jump(int c) {
        if (c < this.jumplimit) {
            System.out.println("Cat " + name + " jump");
        } else {
            System.out.println("Cat " + name + " did not jump");
        }
    }
}