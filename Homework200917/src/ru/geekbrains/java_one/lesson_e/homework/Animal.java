package ru.geekbrains.java_one.lesson_e.homework;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;

    public Animal (String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }

    abstract void run(int a);
    abstract void swim(int b);
    abstract void jump(int c);

}
