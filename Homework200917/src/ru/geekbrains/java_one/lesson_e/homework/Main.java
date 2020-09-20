package ru.geekbrains.java_one.lesson_e.homework;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Barseek", "White", 3);
        Dog d = new Dog("Toozeek", "Black", 5);


        d.run(150);
        d.swim(10);
        d.jump(1);
        c.run(150);
        c.swim(2);
        c.jump(3);
    }

}
