package ru.geekbrains.java_one.lesson_e.homework;

public class Dog extends Animal {
int runlimit = 500;
int swimlimit = 10;
float jumplimit = 0.5f;

    Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void run(int a) {
        if (a < this.runlimit) {
            System.out.println("Dog " + name + " run");
        }else{
            System.out.println("Dog " + name + " did not run");
        }
    }


    @Override
    void swim(int b) {
        if (b < this.swimlimit) {
            System.out.println("Dog " + name + " swim");
        }else{
            System.out.println("Dog " + name + " did not swim");
        }
    }

    @Override
    void jump(int c) {
        if (c < this.jumplimit) {
            System.out.println("Dog " + name + " jump");
        }else{
            System.out.println("Dog " + name + " did not jump");
        }
    }
}
