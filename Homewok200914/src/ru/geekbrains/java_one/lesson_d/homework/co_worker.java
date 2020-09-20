package ru.geekbrains.java_one.lesson_d.homework;

public class co_worker {
    private String name;
    private int pay;
    private int age;


    co_worker(String name, int pay, int age) {
        this.name = name;
        this.pay = pay;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getPay() {
        return pay;
    }
    public int getAge() {
        return age;
    }


}

