package ru.geekbrains.java_one.lesson_d.homework;

public class Main {
    public static void main(String[] args) {
        co_worker a = new co_worker("Vasya", 2000, 20);
        co_worker b = new co_worker("Misha", 2000, 41);
        co_worker c = new co_worker("Ivan", 2000, 42);
        co_worker d = new co_worker("Tanya", 2000, 28);
        co_worker e = new co_worker("Masha", 2000, 27);

        System.out.printf("co_worker %s, pay: %d, age: %d", c.getName(), c.getPay(), c.getAge());

        co_worker[]arr = new co_worker[5];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge()> 40) {
                System.out.printf("%s, pay: %d, age: %d", arr[i].getName(), arr[i].getPay(), arr[i].getAge());
            }
        }

    }


}
